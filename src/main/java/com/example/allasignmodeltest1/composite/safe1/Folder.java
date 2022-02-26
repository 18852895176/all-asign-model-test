package com.example.allasignmodeltest1.composite.safe1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huanggaokui
 * @description: 文件夹
 * @date 2022/2/25 22:11
 */
public class Folder extends Directory{

    private Integer level;
    private List<Directory> dirs;
    public Folder(String name, Integer level) {
        super(name);
        this.dirs = new ArrayList<>();
        this.level = level;
    }

    @Override
    public void show() {
        System.out.println(this.name +" "+ this.level+"层");
        for(Directory dir : dirs){
            if(this.level != null){
                for(int i = 0; i < this.level; i++){
                    System.out.print(" ");
                }
                for(int i=0; i< this.level; i++){
                    if(i==0){
                        System.out.print("+");
                        System.out.print("-");
                    }else {
                        System.out.print("-");
                    }
                }
            }
            dir.show();
        }
    }

    public boolean addChild(Directory dir){
        return this.dirs.add(dir);
    }
    public boolean removeChild(Directory dir){
        return this.dirs.remove(dir);
    }
    public Directory getChild(int index){
        return this.dirs.get(index);
    }
}
