package nico.app.bilibili.nise.net;

import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by Android on 2016/11/10.
 */

public class Net
{
    private static ExecutorService sExecutorService = Executors.newFixedThreadPool(2);

    public static class Raw
    {
        public static byte[] load(String path)
        {
            return null;
        }

        public static byte[][] load(String[] paths)
        {
            return null;
        }

        public static byte[] load(URL url)
        {
            return null;
        }

        public static byte[][] load(URL[] urls)
        {
            return null;
        }

        public static void load(String path, LoadListener listener)
        {
            sExecutorService.submit(new LoadTask(listener));
        }

        public static void load(String[] paths, LoadListener listener)
        {
            sExecutorService.submit(new LoadTask(listener));
        }

        public static void load(URL url, LoadListener listener)
        {
            sExecutorService.submit(new LoadTask(listener));
        }

        public static void load(URL[] urls, LoadListener listener)
        {
            sExecutorService.submit(new LoadTask(listener));
        }
    }

    public static class Bitmap
    {
        public static android.graphics.Bitmap load(String path)
        {
            return null;
        }

        public static android.graphics.Bitmap[] load(String[] paths)
        {
            return null;
        }

        public static android.graphics.Bitmap load(URL url)
        {
            return null;
        }

        public static void load(String path, LoadListener listener)
        {
            sExecutorService.submit(new LoadTask(listener));
        }

        public static void load(URL url, LoadListener listener)
        {
            sExecutorService.submit(new LoadTask(listener));
        }
    }

    public static class String
    {
        public static java.lang.String load(String path)
        {
            return null;
        }

        public static java.lang.String load(URL url)
        {
            return null;
        }

        public static void load(String path, LoadListener listener)
        {
            sExecutorService.submit(new LoadTask(listener));
        }

        public static void load(URL url, LoadListener listener)
        {
            sExecutorService.submit(new LoadTask(listener));
        }
    }

    private static class LoadTask implements Runnable
    {
        LoadListener mListener;

        LoadTask(LoadListener listener)
        {
            mListener = listener;
        }

        @Override
        public void run()
        {

        }
    }

    public interface LoadListener
    {
        void onLoaded(byte[] data);
    }
}
