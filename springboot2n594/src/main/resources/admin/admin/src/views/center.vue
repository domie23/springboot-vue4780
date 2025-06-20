<template>
  <div>
    <el-form
	  :style='{"padding":"30px","boxShadow":"0 0px 0px rgba(64, 158, 255, .3)","borderRadius":"0","flexWrap":"wrap","background":"#fff","display":"flex"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      label-width="100px"
    >  
     <el-row>
        <el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}'   v-if="flag=='xuesheng'"  label="学号" prop="xuehao">
          <el-input v-model="ruleForm.xuehao" readonly              placeholder="学号" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}'   v-if="flag=='xuesheng'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming"               placeholder="姓名" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' v-if="flag=='xuesheng'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in xueshengxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}'   v-if="flag=='xuesheng'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling"               placeholder="年龄" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}'   v-if="flag=='xuesheng'"  label="手机" prop="shouji">
          <el-input v-model="ruleForm.shouji"               placeholder="手机" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}'   v-if="flag=='xuesheng'"  label="班级" prop="banji">
          <el-input v-model="ruleForm.banji"               placeholder="班级" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}'   v-if="flag=='xuesheng'"  label="年级" prop="nianji">
          <el-input v-model="ruleForm.nianji"               placeholder="年级" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' v-if="flag=='xuesheng'" label="教师姓名" prop="jiaoshixingming">
          <el-select  @change="xueshengjiaoshixingmingChange"  v-model="ruleForm.jiaoshixingming" placeholder="请选择教师姓名">
            <el-option
                v-for="(item,index) in xueshengjiaoshixingmingOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}'   v-if="flag=='xuesheng'"  label="教师工号" prop="jiaoshigonghao">
          <el-input v-model="ruleForm.jiaoshigonghao"               placeholder="教师工号" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}'   v-if="flag=='jiaoshi'"  label="教师工号" prop="jiaoshigonghao">
          <el-input v-model="ruleForm.jiaoshigonghao" readonly              placeholder="教师工号" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' v-if="flag=='jiaoshi'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in jiaoshixingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}'   v-if="flag=='jiaoshi'"  label="教师姓名" prop="jiaoshixingming">
          <el-input v-model="ruleForm.jiaoshixingming"               placeholder="教师姓名" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}'   v-if="flag=='jiaoshi'"  label="职称" prop="zhicheng">
          <el-input v-model="ruleForm.zhicheng"               placeholder="职称" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}'   v-if="flag=='jiaoshi'"  label="电话" prop="dianhua">
          <el-input v-model="ruleForm.dianhua"               placeholder="电话" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' v-if="flag=='jiaoshi'" label="照片" prop="zhaopian">
          <file-upload
          tip="点击上传照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
          @change="jiaoshizhaopianUploadChange"
          ></file-upload>
        </el-form-item>
        <el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}'   v-if="flag=='jiaoshi'"  label="班级" prop="banji">
          <el-input v-model="ruleForm.banji"               placeholder="班级" clearable></el-input>
        </el-form-item>
		<el-form-item :style='{"width":"50%","margin":"0 0 20px 0"}' v-if="flag=='users'" label="用户名" prop="username">
			<el-input v-model="ruleForm.username" placeholder="用户名"></el-input>
		</el-form-item>
		<el-form-item :style='{"padding":"0","margin":"0"}'>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"#000","borderRadius":"4px","background":"url(http://codegen.caihongy.cn/20220726/b87f4c4f9a0d4ed194c128c66d95e8bd.png) center center/cover","width":"143px","lineHeight":"58px","fontSize":"15px","height":"58px"}' type="primary" @click="onUpdateHandler">修 改</el-button>
		</el-form-item>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
      xueshengxingbieOptions: [],
      xueshengjiaoshixingmingOptions: [],
      jiaoshixingbieOptions: [],
    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.xueshengxingbieOptions = "男,女".split(',')
    this.$http({
      url: `option/jiaoshi/jiaoshixingming`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.xueshengjiaoshixingmingOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.jiaoshixingbieOptions = "男,女".split(',')
  },
  methods: {
    // 下二随
    xueshengjiaoshixingmingChange () {
      this.$http({
        url: `follow/jiaoshi/jiaoshixingming?columnValue=`+ this.ruleForm.jiaoshixingming,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          console.log('下2随')
              if(data.data.jiaoshigonghao){
                this.ruleForm.jiaoshigonghao = data.data.jiaoshigonghao
              }
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    jiaoshizhaopianUploadChange(fileUrls) {
        this.ruleForm.zhaopian = fileUrls;
    },
    onUpdateHandler() {
      if((!this.ruleForm.xuehao)&& 'xuesheng'==this.flag){
        this.$message.error('学号不能为空');
        return
      }
      if((!this.ruleForm.xingming)&& 'xuesheng'==this.flag){
        this.$message.error('姓名不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'xuesheng'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
      if( 'xuesheng' ==this.flag && this.ruleForm.nianling&&(!isIntNumer(this.ruleForm.nianling))){
       this.$message.error(`年龄应输入整数`);
        return
      }
      if( 'xuesheng' ==this.flag && this.ruleForm.shouji&&(!isMobile(this.ruleForm.shouji))){
        this.$message.error(`手机应输入手机格式`);
        return
      }
      if((!this.ruleForm.jiaoshigonghao)&& 'jiaoshi'==this.flag){
        this.$message.error('教师工号不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'jiaoshi'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
      if((!this.ruleForm.dianhua)&& 'jiaoshi'==this.flag){
        this.$message.error('电话不能为空');
        return
      }
      if( 'jiaoshi' ==this.flag && this.ruleForm.dianhua&&(!isMobile(this.ruleForm.dianhua))){
        this.$message.error(`电话应输入手机格式`);
        return
      }
        if(this.ruleForm.zhaopian!=null) {
                this.ruleForm.zhaopian = this.ruleForm.zhaopian.replace(new RegExp(this.$base.url,"g"),"");
        }
      if((!this.ruleForm.banji)&& 'jiaoshi'==this.flag){
        this.$message.error('班级不能为空');
        return
      }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
	this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  color: #000;
	  	  font-weight: 500;
	  	  width: 100px;
	  	  font-size: 14px;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 100px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border: 2px solid #797979;
	  	  border-radius: 0;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #000;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border: 2px solid #797979;
	  	  border-radius: 0;
	  	  padding: 0 10px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #000;
	  	  width: 200px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 2px solid #797979;
	  	  border-radius: 0;
	  	  padding: 0 10px 0 30px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #000;
	  	  width: 200px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 1px dashed #797979;
	  	  cursor: pointer;
	  	  border-radius: 6px;
	  	  color: #797979;
	  	  width: 90px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 1px dashed #797979;
	  	  cursor: pointer;
	  	  border-radius: 6px;
	  	  color: #797979;
	  	  width: 90px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 2px solid #797979;
	  	  border-radius: 0;
	  	  padding: 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #000;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  height: 120px;
	  	}
</style>
