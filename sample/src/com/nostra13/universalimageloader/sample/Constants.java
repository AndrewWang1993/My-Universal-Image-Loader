/*******************************************************************************
 * Copyright 2011-2013 Sergey Tarasevich
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.nostra13.universalimageloader.sample;

/**
 * @author Sergey Tarasevich (nostra13[at]gmail[dot]com)
 */
public final class Constants {

    public static final String[] IMAGES = new String[]{

            "http://g.hiphotos.baidu.com/image/pic/item/622762d0f703918f166a7ded523d269759eec45a.jpg",
            "http://g.hiphotos.baidu.com/image/pic/item/0824ab18972bd407637e6e9578899e510fb30918.jpg",
            "http://pic.168pic.com/upload/2014/6/11/201461112819952.jpg",
            "http://pic.168pic.com/upload/2013/9/4/2013941815522.jpg",
            "http://pic.168pic.com/upload/2014/6/11/201461114222665.jpg",
            "http://tupian.enterdesk.com/2014/xll/04/22/1/peiziqi4.JPG.680.510.jpg",
            "http://tupian.enterdesk.com/2014/xll/04/22/1/peiziqi7.jpg.680.510.jpg",
            "http://tupian.enterdesk.com/2014/xll/04/22/1/peiziqi8.jpg.680.510.jpg",
//            "file:///sdcard/Universal Image Loader @#&=+-_.,!()~'%20.png", // Image from SD card with encoded symbols
//            "assets://Living Things @#&=+-_.,!()~'%20.jpg", // Image from assets
//            "drawable://" + R.drawable.ic_launcher, // Image from drawables

    };

    private Constants() {
    }

    public static class Config {
        public static final boolean DEVELOPER_MODE = false;
    }

    public static class Extra {
        public static final String FRAGMENT_INDEX = "com.nostra13.example.universalimageloader.FRAGMENT_INDEX";
        public static final String IMAGE_POSITION = "com.nostra13.example.universalimageloader.IMAGE_POSITION";
    }
}
