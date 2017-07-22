# AndroidCircularLoadingView
  安卓环形loading控件\<br>
![img](https://github.com/506954774/AndroidCircularLoadingView/blob/master/loading_view.gif?raw=true)\<br>

##可以自定义的属性:\<br>
>>name="base_color" format="color" //内层圆环的颜色\<br>
>>name="progress_color" format="color"//进度圆环的颜色\<br>
>>name="max" format="float" //最小值\<br>
>>name="min" format="float" //最大值\<br>
>>name="duration" format="integer" //动画时长\<br>
>>name="progress_stroke_width" format="integer" //圆环宽度\<br>
>>name="argQuantity" format="integer" //等分(圆弧加间隔),比如arcQuantity=100时,表示将有100个圆弧,和100个空白间隔\<br>
>>name="ratio" format="float" //每段圆弧与圆弧加间隔之和的比例,ratio=0.5表示每个圆弧与相邻的间隔弧度比是1:1\<br>

##设置当前value,无动画效果:\<br>
public void setValue(float value)\<br>

##设置当前value,带动画效果:\<br>
public void setValueWithAnimation(float value, int duration)\<br>