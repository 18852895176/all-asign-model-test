package com.example.allasignmodeltest1.chain.general;

import lombok.Data;

/**
 * @author huanggaokui
 * @description: 链
 * @date 2022/2/17 20:32
 */
@Data
public abstract class Handler {
    public Handler nextHandler;
    public abstract void handleRequest(String name);
}
