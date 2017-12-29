/**
 * 
 */
package com.mktest.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author Mangesh K
 *
 */
@Service
public class TopicService {

	private static List<Topic> topics = Arrays.asList(new Topic("java", "Core Java", "Core Java J2SE"),
			new Topic("spring", "Spring Framework", "Java J2EE Spring"), new Topic("javascript", "JavaScript Framework", "Web Application scripting language"));

	public List<Topic> getAllTopics() {
		return topics;
	}

}
