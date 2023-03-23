package com.yangweiyao.mode.command.product;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-22 17:04
 * @Description 音响
 **/
public class Stereo extends AbstractProduct {

    private Thread thread;

    public Stereo(String name) {
        super(name);
    }

    public void playCD() {
        // 模拟播放《北京欢迎你》歌曲
        thread = new Thread(() -> {
            while (getStatus() == 0) {
                System.out.println("北京欢迎你... ");
            }
        });
        thread.start();
    }

    public void setVolume(int volume) {
        if(getStatus() == 0) {
            System.out.println("音量设置为: " + volume);
        }
    }

    @Override
    public void doSomethingByOn(String name) {
        System.out.println("打开" + name + "音响...");
    }

    @Override
    public void doSomethingByOff(String name) {
        if(thread.isAlive()) {
            thread.interrupt();
        }
        System.out.println("关闭" + name + "音响...");
    }


}
