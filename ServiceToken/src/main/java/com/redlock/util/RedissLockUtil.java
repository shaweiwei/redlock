package com.redlock.util;

import java.util.concurrent.TimeUnit;

import com.redlock.locker.DistributedLocker;


/**
 * redis分布式锁工具类
 * @author ko
 *
 */
public class RedissLockUtil {
    private static DistributedLocker redissLock;
    
    public static void setLocker(DistributedLocker locker) {
        redissLock = locker;
    }
    
    public static void lock(String lockKey) {
        redissLock.lock(lockKey);
    }

    public static void unlock(String lockKey) {
        redissLock.unlock(lockKey);
    }

    /**
     * 带超时的锁
     * @param lockKey
     * @param timeout 超时时间   单位：秒
     */
    public static void lock(String lockKey, int timeout) {
        redissLock.lock(lockKey, timeout);
    }
    
    /**
     * 带超时的锁
     * @param lockKey
     * @param unit 时间单位
     * @param timeout 超时时间
     */
    public static void lock(String lockKey, TimeUnit unit ,int timeout) {
        redissLock.lock(lockKey, unit, timeout);
    }
}