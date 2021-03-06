package com.sun.chapterFive_String;

import java.util.Date;

import org.junit.Test;

/**
 * String
 * 
 * @author 飞
 * @date 2017年9月13日
 */
public class StringDemo {

	@Test
	public void test1() {
		char a[] = { 'a', 'b', 'c', 'd', 'e' };
		String s = new String(a);
		System.out.println(s);
	}

	/**
	 * 字符串连接 使用'+'运算符可以实现连接多个字符串的功能.'+'运算符可以连接多个运算符并产生一个String对象
	 */
	@Test
	public void test2() {
		// 创建String对象
		String str1 = new String("hello");
		String str2 = new String("java");
		String str3 = str1 + str2;
		System.out.println(str3);
	}

	/**
	 * String连接其他数据类型 其他数据类型与字符串连接,会将这些类型数据直接转换成字符串
	 */
	@Test
	public void test3() {
		// 创建String对象
		String str = new String("我叫Tom");
		// 定义int类型变量age
		int age = 17;
		// 定义float类型变量f
		float f = 2.5f;
		// 三种类型数据相加
		System.out.println(str + "我今年" + age + "岁,我喜欢看书,每天看" + f + "小时");
	}

	/**
	 * 获取字符串长度 使用String类的length()方法可以获取字符串对象的长度
	 */
	@Test
	public void test4() {
		// 创建字符串对象
		String str = new String("你们好,我叫Tom.");
		int length = str.length();
		System.out.println(str + "这个字符创的长度是:" + length);
	}

	/**
	 * 字符串查找 String类提供了两种查找字符串的方法,indexOf()和lastIndexOf()
	 * indexOf()返回搜索的字符或字符串第一次出现的位置,返回值为整数,从0开始计算,如果没有返回-1
	 * lastIndexOf()方法返回的是搜索的字符或字符串最后一次出现位置的索引,没有返回-1
	 */
	@Test
	public void test5() {
		// 创建String对象
		String str = new String("abcdefghijkf");
		// 创建要搜索的字符subStr
		String sbuStr = new String("f");
		// 搜索字符'a'在str中那个位置出现
		int firstIndex = str.indexOf(sbuStr);
		System.out.println(firstIndex);
		// 搜索字符'f'最后出现的索引位置
		int lastIndex = str.lastIndexOf(sbuStr);
		System.out.println(lastIndex);
	}

	/**
	 * 获取指定索引位置的字符 charAt()方法可以将指定索引处的字符返回
	 */
	@Test
	public void test6() {
		// 创建字符串对象
		String str = "hello word";
		// 返回指定索引为3的字符
		char charAt = str.charAt(3);
		System.out.println(charAt);
	}

	/**
	 * 获取子字符串 sbustring(int beginIndex) 该方法返回的是从指定的索引位置开始截取直到该字符串结尾的子串
	 * sbustring(int beginIndex,int endIndex) 该方法第二个参数指定截取到该索引位置
	 */
	@Test
	public void test7() {
		// 创建String对象
		String str = new String("hello world");
		// 指定索引,截取子字符串
		String substring = str.substring(3);
		System.out.println(substring);
	}

	@Test
	public void test8() {
		// 创建String 对象
		String str = new String("好好学习,天天向上.");
		String substring = str.substring(1, 6);
		System.out.println(substring);
	}

	/**
	 * 去除空格 str.trim() 该方法返回字符串的副本,忽略头部和尾部的空格
	 */

	@Test
	public void test9() {
		// 创建String 对象
		String str = new String("  好好学习,天天向上.   ");
		int length1 = str.length();
		String trim = str.trim();
		int length2 = trim.length();
		System.out.println(trim + "字符串原来长度为" + length1 + "字符串现在长度为:" + length2);
	}

	/**
	 * 字符串替换 str.replace(char oldChar,char newChar) 该方法可实现将指定的字符或字符串替换成新的字符或字符串
	 * oldChar:该参数指定要替换的字符或字符串 newChar:该参数指定用于替换原来字符串的内容
	 * 如果替换内容有多处重复出现,会将所有的都替换掉,而且如果是字母是区分大小写的.
	 */
	@Test
	public void test10() {
		// 创建String 对象
		String str = new String("好好学习,天天向上.好好学习,天天向上.好好学习,天天向上.好好学习,天天向上.");
		String replace = str.replace("天天", "努力");
		System.out.println(replace);
	}

	/**
	 * 判断字符串开始与结尾 startWith(String prefix) endWith(String prefix)
	 * 两种方法分别用于判断字符串是否以指定内容开始获结束
	 */

	@Test
	public void test11() {
		// 创建String 对象
		String str1 = new String("hello world hello java");
		String str2 = new String("hello java hello world");
		boolean startsWith1 = str1.startsWith("he");
		boolean startsWith2 = str1.startsWith("ld");
		boolean endsWith1 = str2.endsWith("ld");
		boolean endsWith2 = str2.endsWith("he");
		System.out.println(startsWith1);
		System.out.println(startsWith2);
		System.out.println(endsWith1);
		System.out.println(endsWith2);
	}

	/**
	 * 判断字符串是否相等 字符串对象的比较不能简单的使用比较运算符"==",因为比较运算符比较的是两个字符串的地址值是否相同
	 * 及时两个字符串的内容相同,两个对象的内存地址也是不同的,使用比较运算符仍然会显示false str.equals(String otherser)
	 * 该方法比较两个字符串字符和长度是否相同,区分大小写 str.equalslgnoreCase(String otherser)
	 * 该方法比较字符串是不区分大小写的
	 */
	/**
	 * 使用比较运算符进行比较,结果为false,因为比较的是内存中的地址值,这是不相同的
	 */
	@Test
	public void test12() {
		// 创建String 对象
		String str1 = new String("好好学习,天天向上");
		String str2 = new String("好好学习,天天向上");
		boolean b = (str1 == str2);
		System.out.println(b);
	}

	/**
	 * 使用str.equals(String otherser)比较两个字符串
	 */
	@Test
	public void test13() {
		// 创建String 对象
		String str1 = new String("abcde");
		String str2 = new String("ABCDE");
		String str3 = new String("abcde");
		// 比较str1与str2,一个大写一个小写
		boolean equals1 = str1.equals(str2);
		// 使用str.equalslgnoreCase(String otherser)比较str1与str2
		boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);
		// 比较str1与str3,两个字符与长度相同
		boolean equals2 = str1.equals(str3);
		System.out.println(equals1);
		System.out.println(equalsIgnoreCase);
		System.out.println(equals2);
	}

	/**
	 * 按照字典顺序比较两个字符串 str.compareTo(String otherstr)
	 * 该方法为按照字典顺序比较两个字符串,该比较基于字符串中各个字符的Unicode值
	 * 如果按照字典顺序此String对象位于参数字符串之前,则比较结果为一个负整数
	 * 如果按照字典顺序此String对象位于参数字符串之后,则比较结果为一个正整数 如果两个字符串相等,返回0
	 */
	@Test
	public void test14() {
		// 创建String对象
		String str1 = new String("a");
		String str2 = new String("b");
		String str3 = new String("a");
		// 按照字典顺序进行比较str1与str2
		int compareTo1 = str1.compareTo(str2);
		// 按照字典顺序进行比较str3与str2
		int compareTo2 = str2.compareTo(str1);
		// 按照字典顺序进行比较str3与str1
		int compareTo3 = str3.compareTo(str1);
		System.out.println(compareTo1);
		System.out.println(compareTo2);
		System.out.println(compareTo3);
	}

	/**
	 * 字母大小转换 str.toLowerCase() 该方法将String转换为小写,如过字符串中没有应该被转换的字符,则将原字符串返回;
	 * 否则返回一个新的字符串,将原来字符串中的大写转成等价的小写字符,字符串长度相同 str.toUpperCase()
	 * 该方法将String转换为大写,如过字符串中没有应该被转换的字符,则将原字符串返回;
	 * 否则返回一个新的字符串,将原来字符串中的小写转成等价的大写字符,字符串长度相同
	 */

	@Test
	public void test15() {
		// 创建String对象
		String str = new String("ABcdEfgH");
		// 将str中的大写字母转成小写字母
		String lowerCase = str.toLowerCase();
		// 将str中小写字母转成大写字母
		String upperCase = str.toUpperCase();
		System.out.println(lowerCase);
		System.out.println(upperCase);
	}

	/**
	 * 字符串分割 该方法可以使字符串按照指定的分割字符或字符串对内容进行分割, 并将分割后的结果存放在字符串数组中,该方法提供了两种分割方式
	 * str.split(String sign) sign为分割字符串的分割符,也可以使用正则表达式.
	 * 没有同意的对字进行分割的符号,如果想定义多个分割符,可以使用符号"|",例如,",|="表示分割符分别为","和"="
	 * str.split(String sign,int limit) 该方法可根据给定的分割符对字符串进行拆分,并限定拆分次数
	 * 其中sign为分割符,limit为限制的分割次数
	 * 
	 */
	@Test
	public void test16() {
		// 创建字符串
		String str = "123.432.543.432.5342.234";
		// 按照'.'进行分割,使用转义字符\\
		String[] split = str.split("\\.");
		// 遍历数组取值
		for (String s : split) {
			System.out.println(s);
		}
		System.out.println("-----------------------");
		// 按照"."进行分割,限制分割2次,使用转义字符\\
		String[] split2 = str.split("\\.", 2);
		// 遍历数组取值
		for (String s : split2) {
			System.out.println(s);
		}
	}

	/**
	 * 格式化字符串 str.format(String format,Object...args)
	 * 
	 */

	/**
	 * 日期和时间字符串格式化 format()方法通过给定的特殊转换符作为参数来实现对日期和时间的格式化
	 */
	// 实现将当前日期信息以4位年份,月份全称,2位日期形式输出
	@Test
	public void test17() {
		// 创建Date对象
		Date date = new Date();
		// 格式化4位年份
		String year = String.format("%tY", date);
		// 格式化月份全称
		String month = String.format("%tB", date);
		// 格式化2位日期形式输出
		String newdate = String.format("%td", date);
		System.out.println("今年是" + year + "年," + "现在是" + month + newdate + "号");
	}

	/**
	 * 时间格式化 使用format()方法不仅可以完成日期格式化,也可以实现时间的格式化
	 */
	// 实现将当前时间信息以2位小时数,2位分钟数,2位秒数形式输出出来
	@Test
	public void test18() {
		// 创建Date对象
		Date date = new Date();
		String hour = String.format("%tH", date);
		String minute = String.format("%tM", date);
		String second = String.format("%tS", date);
		System.out.println("现在是:" + hour + "时" + minute + "分" + second + "秒");
	}

	/**
	 * 格式化常见的日期时间组合
	 */
	@Test
	public void test19() {
		// 创建Date对象
		Date date = new Date();
		// 格式化4位年份 "年-月-日"
		String year = String.format("%tF", date);
		// 格式化全部日期和时间
		String time = String.format("%tc", date);
		// 格式化 时:分:秒 格式,24小时制
		String time2 = String.format("%tT", date);
		System.out.println("全部的时间是:" + time);
		System.out.println("现在的年-月-日是:" + year);
		System.out.println("现在的时:分:秒是:" + time2);
	}

	/**
	 * 常见类型格式化 转换符看表
	 */
	// 实现不同数据类型的转化
	@Test
	public void test20() {
		// 将结果以十进制格式显示
		String str1 = String.format("%d", 100 * 2);
		// 将结果以boolean型显示
		String str2 = String.format("%b", 5 != 10);
		// 将结果以十六进制转化
		String str3 = String.format("%x", 1000);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

	/**
	 * 正则表达式
	 */
	@Test
	public void test21() {

	}

	/**
	 * 字符串生成器 创建成功的字符串对象,其长度是固定的,内容不能被改变和编译.使用"+"可以达到附加新字符或字符串的目的,
	 * 但是会产生一个新的String实例,会在内存周静创建新的字符串对象. 频繁的对字符串进行修改,会极大的增加系统开销.
	 * J2SE5.0以后新增可变的字符序列String-Builder类,极大的提高了频繁增加字符串的效率
	 */
	//验证字符串操作和字符串生成器操作的效率
	@Test
	public void test22() {
		//创建空字符串
		String str = "";
		//定义对字符串执行操作的起始时间
		long starTime = System.currentTimeMillis();
		//利用循环操作执行10000次追加字符串操作
		for (int i = 0; i < 10000; i++) {
			str=str+i;
		}
		//定义对字符串操作后的时间
		long endTime = System.currentTimeMillis();
		//计算对字符串操作的时间
		long time = endTime - starTime;
		System.out.println("追加10000次字符串所用时间:"+time+"毫秒");
		
		//创建字符串生成器
		StringBuilder builder = new StringBuilder("");
		//定义操作前起始时间
		long starTime2 = System.currentTimeMillis();
		//使用循环利用生成器追加10000次字符串
		for (int j = 0; j < 10000; j++) {
			builder.append(j);
		}
		//计算操作后时间
		long endTime2 = System.currentTimeMillis();
		//计算追加操作执行时间
		long time2 = endTime2 - starTime2;
		System.out.println("使用生成器追加10000次字符串所用时间:"+time2+"毫秒");
	}
	//通过结果可以看出,两次操作执行时间相差很大.如果在程序中频繁附加字符串,建议使用StringBuilder
	
	/**
	 * append(content)
	 * content表示也要追加到字符串生成器中的内容.
	 * 该方法用于向字符串生成器中追缴内容.通过该方法多个重载形式,可实现接收任何类型的数据,
	 * 如:int,boolean,char,String,double或者另一个字符串生成器等
	 * 
	 * insert(int offset arg)
	 * 该方法用于向字符串生成器中的指定位置插入数据内容.
	 * 通过不同的重载形式,可实现插入int,float,char和boolean等基本数据类型或其他独享
	 * 
	 * delete(int start,int end)
	 * 该方法可以移除次序列的子字符串中的字符.
	 * 该子字符串从指定的start处开始,一直到索引end-1处的字符,如果不存在这种字符,则一直到序列尾部.
	 * 如果start等于end,则不发生任何更改
	 */
	@Test
	public void test23() {
		//创建字符生成器
		StringBuilder builder = new StringBuilder("hello world");
		//向生成器中追加hello java
		StringBuilder append = builder.append(" hello java");
		//打印追加后字符串
		System.out.println(append.toString());
		
		//创建字符生成器
		StringBuilder builder2 = new StringBuilder("hello world");
		//向生成器中插入" java"
		StringBuilder insert = builder2.insert(5, " java");
		System.out.println(insert.toString());
		
		//创建字符生成器
		StringBuilder builder3 = new StringBuilder("hello world hello java");
		//移除字符串中子字符串
		StringBuilder delete = builder3.delete(11, 22);
		System.out.println(delete.toString());
	}
}
