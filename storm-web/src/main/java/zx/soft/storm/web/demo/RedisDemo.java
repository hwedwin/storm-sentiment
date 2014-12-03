package zx.soft.storm.web.demo;

import zx.soft.redis.client.cache.Cache;
import zx.soft.redis.client.cache.CacheFactory;

public class RedisDemo {

	public static void main(String[] args) {

		Cache cache = CacheFactory.getInstance();
		String key = "stream:word:count";
		System.out.println(cache.smembers(key));

	}

}
