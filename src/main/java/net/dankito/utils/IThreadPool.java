package net.dankito.utils;

/**
 * Created by ganymed on 03/11/16.
 */

public interface IThreadPool {

  void runAsync(Runnable task);

}
