//
//       _/_/_/                      _/            _/_/_/_/_/
//    _/          _/_/      _/_/    _/  _/              _/      _/_/      _/_/
//   _/  _/_/  _/_/_/_/  _/_/_/_/  _/_/              _/      _/    _/  _/    _/
//  _/    _/  _/        _/        _/  _/          _/        _/    _/  _/    _/
//   _/_/_/    _/_/_/    _/_/_/  _/    _/      _/_/_/_/_/    _/_/      _/_/
//
//
//  Copyright (c) 2015-2016, Geek Zoo Studio
//  http://www.geek-zoo.com
//
//
//  Permission is hereby granted, free of charge, to any person obtaining a
//  copy of this software and associated documentation files (the "Software"),
//  to deal in the Software without restriction, including without limitation
//  the rights to use, copy, modify, merge, publish, distribute, sublicense,
//  and/or sell copies of the Software, and to permit persons to whom the
//  Software is furnished to do so, subject to the following conditions:
//
//  The above copyright notice and this permission notice shall be included in
//  all copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
//  FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
//  IN THE SOFTWARE.
//

package com.insthub.O2OMobile.Protocol;

import com.external.activeandroid.DataBaseModel;
import com.external.activeandroid.annotation.Column;
import com.external.activeandroid.annotation.Table;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Table(name = "reportRequest")
public class reportRequest  extends DataBaseModel
{

     @Column(name = "content")
     public CONTENT   content;

     @Column(name = "uid")
     public int uid;

     @Column(name = "sid")
     public String   sid;

     @Column(name = "ver")
     public int ver;

     @Column(name = "order_id")
     public int order_id;

     @Column(name = "user")
     public int user;

     public void  fromJson(JSONObject jsonObject)  throws JSONException
     {
          if(null == jsonObject){
            return ;
           }

          JSONArray subItemArray;
          CONTENT  content = new CONTENT();
          content.fromJson(jsonObject.optJSONObject("content"));
          this.content = content;

          this.uid = jsonObject.optInt("uid");

          this.sid = jsonObject.optString("sid");

          this.ver = jsonObject.optInt("ver");

          this.order_id = jsonObject.optInt("order_id");

          this.user = jsonObject.optInt("user");
          return ;
     }

     public JSONObject  toJson() throws JSONException 
     {
          JSONObject localItemObject = new JSONObject();
          JSONArray itemJSONArray = new JSONArray();
          if(null != content)
          {
            localItemObject.put("content", content.toJson());
          }
          localItemObject.put("uid", uid);
          localItemObject.put("sid", sid);
          localItemObject.put("ver", ver);
          localItemObject.put("order_id", order_id);
          localItemObject.put("user", user);
          return localItemObject;
     }

}
