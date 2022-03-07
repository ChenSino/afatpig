package com.chenkun;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author chenkun
 * @Description
 * @date 2022/2/25 下午4:03
 */
public class Use {
    public void use11(){
        ServiceLoader<Search> load = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = load.iterator();
        while (iterator.hasNext()) {
            Search next = iterator.next();
            next.searchUnique();
        }
    }
}
