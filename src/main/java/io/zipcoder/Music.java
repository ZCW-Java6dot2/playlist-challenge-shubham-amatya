package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        int count =0;
        int stopIndex;
        if(startIndex.equals(selection)){
            return 0;
        }

        for (int i = 0; i < playList.length; i++) {
            if(playList[i].equalsIgnoreCase(selection)){
                stopIndex = i;
                count = stopIndex - startIndex;
                if((startIndex==0) && (playList[playList.length-1].equalsIgnoreCase(selection))){
                    return 1;

                }
            }
        }

        return count;
    }
}
