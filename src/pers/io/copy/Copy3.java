package pers.io.copy;

import java.io.*;

/**
 * @Author LiZiHao
 * @Date 2022/07/08/21:33
 */
public class Copy3 {
    public static void main(String[] args) {
        File src = new File("D:\\BaiduNetdiskDownload");
        File tra = new File("C:\\");
        try {
            Copy(src, tra);
        } catch (CopyException e) {
            e.printStackTrace();
        }
    }

    /**
     * 目录的拷贝
     *
     * @param srcFile  源文件路径
     * @param destFile 目标文件夹路径
     */
    public static void Copy(File srcFile, File destFile) throws CopyException {
//        获取文件夹的子目录
        File[] files = srcFile.listFiles();
        if (!srcFile.exists()) {
            throw new CopyException("源文件不存在");
        }
        if (!destFile.isDirectory()) {
            throw new CopyException("目标文件不是目录");
        }
        if (files == null || files.length == 0) {
            return;
        }
        for (File file : files) {
//            如果这个文件夹是目录,那么就在指定的位置创建对应目录.
            if (file.isDirectory()) {
                File file1 = new File((destFile.getAbsolutePath().endsWith("\\") ?
                        destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\") +
                        file.getAbsolutePath().substring(3));
                if (!file1.exists()) {
                    file1.mkdirs();
                }
            }
//            这个文件夹不是目录,而是文件.是文件就复制
            if (file.isFile()) {
                FileInputStream in = null;
                FileOutputStream out = null;
                try {
//                  创建输入流对象
                    in = new FileInputStream(file);
//                    创建该文件的文件夹
                    File file1 = new File((destFile.getAbsolutePath().endsWith("\\") ?
                            destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\") +
                            srcFile.getAbsolutePath().substring(3));
                    if (!file1.exists()) {
                        file1.mkdirs();
                    }
//                  创建输出流对象
                    out = new FileOutputStream((destFile.getAbsolutePath().endsWith("\\") ?
                            destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\") +
                            file.getAbsolutePath().substring(3));
//                    一边读一边写
                    byte[] bytes = new byte[1024 * 1024];
                    int read = 0;
                    while ((read = in.read(bytes)) != -1) {
                        out.write(bytes, 0, read);

                    }
//                    刷新输出流
                    out.flush();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } finally {
                    if (in != null) {
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (out != null) {
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            Copy(file, destFile);
        }
    }
}