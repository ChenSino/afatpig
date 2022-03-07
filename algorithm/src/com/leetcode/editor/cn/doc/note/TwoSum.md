```java
    public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap(8);
            for (int i = 0; i < nums.length; i++) {
                int another = target - nums[i];
        //若在map中已经找到了满足条件的直接返回
                if (map.containsKey(another)) {
                    return new int[]{map.get(another),i};
                }
                //若在map未找到满足条件的，则加入map,key为数组值，value为索引
                map.put(nums[i], i);
            }
            return null;
        }
```
> 利用hashmap的特性，key是存在一个hash表中，和暴力破解的方法相比，此方法不过是用空间换了时间
> ，时间复杂度O(n)，空间复杂度O(n)