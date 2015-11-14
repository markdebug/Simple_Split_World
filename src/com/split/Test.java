package com.split;

public class Test {
    public static void main(String[] args) {
        SimpleSplit split = new SimpleSplit("中文分词在中文信息处理中是最最基础的，无论机器翻译亦或信息检索还是其他相关应用，如果涉及中文");
        split.getResult().stream().forEach(System.out::println);
    }
}
