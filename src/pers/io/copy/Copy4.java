package pers.io.copy;

import pers.io.CopyException;

import java.io.*;

/**
 * @Author LiZiHao
 * @Date 2022/07/09/12:00
 */
public class Copy4 {
    public static void main(String[] args) {
        try {
            copy("D:\\Videos", "C:\\Videos");
        } catch (CopyException e) {
            e.printStackTrace();
        }
    }

    /**
     * 目录的拷贝
     *
     * @param srcPath    原文件夹路径
     * @param targetPath 目标文件夹路径
     */
    public static void copy(String srcPath, String targetPath) throws CopyException {
        if (srcPath.length() == 0) {
            throw new CopyException("原目录不存在");
        }
//        源文件夹对象
        File src = new File(srcPath);
//        目标文件夹对象
        File tar = new File(targetPath);

        if (!tar.isDirectory()) {
            throw new CopyException("目标文件夹不是目录");
        }
        if (!src.exists()) {
            throw new CopyException("源文件夹不存在");
        }


//        如果源目录是文件,则复制.
        if (src.isFile()) {
//            创建输入输出流对象
            FileInputStream fileInputStream = null;
            FileOutputStream fileOutputStream = null;
//          一边读一边写
            try {
                fileInputStream = new FileInputStream(src);
                fileOutputStream = new FileOutputStream((tar.getAbsolutePath().endsWith("\\") ? tar.getAbsolutePath() : tar.getAbsolutePath() + "\\") + src.getAbsolutePath().substring(3));
                byte[] bytes = new byte[1024 * 1024];
                int readCount;
                while ((readCount = fileInputStream.read(bytes)) != -1) {
                    fileOutputStream.write(bytes, 0, readCount);
                }
//                刷新输出流
                fileOutputStream.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

//      如果元目录是目录则创建目录.
        File[] listFiles = src.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            throw new CopyException("源目录下没有任何文件");
        }
        for (File file : listFiles) {
//            获取所有文件
//            System.out.println(file.getAbsolutePath());
            if (file.isDirectory()) {
//                System.out.println(file.getAbsolutePath());
//                源目录:"D:\\BaiduNetdiskDownload"
//                目标目录:"C:\\"
//                目标目录是源目录截取三位后加上目标目录的新目录
                String eds = (tar.getAbsolutePath().endsWith("\\") ? tar.getAbsolutePath() : tar.getAbsolutePath() + "\\") + (file.getAbsolutePath().substring(3));
//                System.out.println(eds);
                File newFile = new File(eds);
                if (!newFile.exists()) {
                    newFile.mkdirs();
                }
            }
            copy(file.getAbsolutePath(), tar.getAbsolutePath());
        }
        /*if (!src.isDirectory()) {
            throw new CopyException("源文件夹不是目录");
        }*/
    }
}

