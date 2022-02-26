package com.example.allasignmodeltest1.composite.safe4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huanggaokui
 * @description: 文件夹
 * @date 2022/2/25 23:36
 */
public class Folder extends Directory{
    private List<Directory> dirs;
    private Integer level;

    public Folder(String name, Integer level) {
        super(name);
        this.level = level;
        this.dirs = new ArrayList<Directory>();
    }

    @Override
    public void show() {
        System.out.println(this.name +" "+ this.level+"层");
        for(Directory dir : dirs){
            if(this.level != null){
                for(int i=0; i< this.level; i++){
                    System.out.print(" ");
                }
                for(int i =0; i< this.level; i++){
                    if(i==0){
                        System.out.print("+");
                        System.out.print("-");
                    }else{
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
        return  this.dirs.get(index);
    }
}
