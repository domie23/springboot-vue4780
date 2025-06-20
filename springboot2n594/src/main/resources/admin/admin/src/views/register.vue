<template>
	<div>
		<div class="container" :style='{"minHeight":"100vh","backgroundAttachment":"fixed","alignItems":"flex-end","background":"url(http://codegen.caihongy.cn/20220805/fcc82c8be5f04b31a9d3c486f4ae68d4.png)","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"flex-start"}'>
			<el-form v-if="pageFlag=='register'" :style='{"padding":"40px 0 20px","boxShadow":"4px 0px 10px rgba(255, 221, 144, 0.8)","margin":"0","borderRadius":"0 146px 0 0","background":"rgba(255,255,255,0.5)","width":"1100px","height":"90vh"}' ref="rgsForm" class="rgs-form" :model="rgsForm">
				<div v-if="true" :style='{"margin":"0 0 10px 0","color":"#000","textAlign":"center","width":"100%","lineHeight":"100px","fontSize":"28px","fontWeight":"bold"}' class="title">课表管理系统注册</div>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">学号</div>
					<el-input  v-model="ruleForm.xuehao"  autocomplete="off" placeholder="学号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">姓名</div>
					<el-input  v-model="ruleForm.xingming"  autocomplete="off" placeholder="姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">密码</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">确认密码</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">性别</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
                        <el-option
                            v-for="(item,index) in xueshengxingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">年龄</div>
					<el-input  v-model="ruleForm.nianling"  autocomplete="off" placeholder="年龄"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">手机</div>
					<el-input  v-model="ruleForm.shouji"  autocomplete="off" placeholder="手机"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">班级</div>
					<el-input  v-model="ruleForm.banji"  autocomplete="off" placeholder="班级"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">年级</div>
					<el-input  v-model="ruleForm.nianji"  autocomplete="off" placeholder="年级"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">教师姓名</div>
                    <el-select @change="xueshengjiaoshixingmingChange" v-model="ruleForm.jiaoshixingming" placeholder="请选择教师姓名" >
                        <el-option
                            v-for="(item,index) in xueshengjiaoshixingmingOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">教师工号</div>
					<el-input  v-model="ruleForm.jiaoshigonghao" readonly autocomplete="off" placeholder="教师工号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">教师工号</div>
					<el-input  v-model="ruleForm.jiaoshigonghao"  autocomplete="off" placeholder="教师工号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">密码</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">确认密码</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">性别</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
                        <el-option
                            v-for="(item,index) in jiaoshixingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">教师姓名</div>
					<el-input  v-model="ruleForm.jiaoshixingming"  autocomplete="off" placeholder="教师姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">职称</div>
					<el-input  v-model="ruleForm.zhicheng"  autocomplete="off" placeholder="职称"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">电话</div>
					<el-input  v-model="ruleForm.dianhua"  autocomplete="off" placeholder="电话"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">照片</div>
                    <file-upload
                        tip="点击上传照片"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
                        @change="jiaoshizhaopianUploadChange"
                    ></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"50%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">班级</div>
					<el-input  v-model="ruleForm.banji"  autocomplete="off" placeholder="班级"  type="text"  />
				</el-form-item>
				<button :style='{"border":"0","cursor":"pointer","padding":"0 10px","boxShadow":"0 0 0px rgba(64, 158, 255, .5)","margin":"20px auto 5px","color":"#fff","display":"block","outline":"none","borderRadius":"0","background":"linear-gradient(122deg, #4885B1 0%, #A4D7F2 51%, #FCEAC4 100%)","width":"50%","fontSize":"18px","fontWeight":"bold","height":"70px"}' type="button" class="r-btn" @click="login()">注册</button>
				<div :style='{"cursor":"pointer","padding":"0 10%","color":"#fff","textAlign":"center","display":"inline-block","width":"100%","lineHeight":"1","fontSize":"12px","textDecoration":"underline"}' class="r-login" @click="close()">已有账号，直接登录</div>
			</el-form>
			
		</div>
	</div>
</template>

<script>

export default {
	data() {
		return {
			ruleForm: {
                xingbie: '',
                jiaoshigonghao: '',
                xingbie: '',
			},

            pageFlag : '',
			tableName:"",
			rules: {},
            xueshengxingbieOptions: [],
            xueshengjiaoshixingmingOptions: [],
            jiaoshixingbieOptions: [],
		};
	},
	mounted(){
        this.pageFlag = this.$storage.get("pageFlag");
		let table = this.$storage.get("loginTable");
		this.tableName = table;
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
	created() {
    
	},
	destroyed() {
		  	},
	methods: {
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		close(){
			this.$router.push({ path: "/login" });
		},
        // 下二随
        xueshengjiaoshixingmingChange () {
            this.$http({
                url: `follow/jiaoshi/jiaoshixingming?columnValue=`+ this.ruleForm.jiaoshixingming,
                method: "get"
            }).then(({ data }) => {
                if (data && data.code === 0) {
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

        // 多级联动参数


		// 注册
		login() {
			var url=this.tableName+"/register";
					if((!this.ruleForm.xuehao) && `xuesheng` == this.tableName){
						this.$message.error(`学号不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.xingming) && `xuesheng` == this.tableName){
						this.$message.error(`姓名不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.mima) && `xuesheng` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `xuesheng` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					if(`xuesheng` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
						this.$message.error(`年龄应输入整数`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					if(`xuesheng` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
						this.$message.error(`手机应输入手机格式`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				
					if((!this.ruleForm.jiaoshigonghao) && `jiaoshi` == this.tableName){
						this.$message.error(`教师工号不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.mima) && `jiaoshi` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `jiaoshi` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.dianhua) && `jiaoshi` == this.tableName){
						this.$message.error(`电话不能为空`);
						return
					}
					
					
					
					
					
					
					if(`jiaoshi` == this.tableName && this.ruleForm.dianhua&&(!this.$validate.isMobile(this.ruleForm.dianhua))){
						this.$message.error(`电话应输入手机格式`);
						return
					}
					
					
					
					
            if(this.ruleForm.zhaopian!=null) {
                this.ruleForm.zhaopian = this.ruleForm.zhaopian.replace(new RegExp(this.$base.url,"g"),"");
            }
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.banji) && `jiaoshi` == this.tableName){
						this.$message.error(`班级不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
				
			
			this.$http({
				url: url,
				method: "post",
				data:this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "注册成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.$router.replace({ path: "/login" });
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
	.container {
	  position: relative;
	  background: url(http://codegen.caihongy.cn/20220805/fcc82c8be5f04b31a9d3c486f4ae68d4.png);

		.el-date-editor.el-input {
		  width: 100%;
		}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border: 0;
						border-radius: 0;
						padding: 0 10px;
						box-shadow: 4px 4px 0px rgba(255, 221, 144, 0.5);
						outline: none;
						color: #000;
						width: 100%;
						font-size: 14px;
						height: 44px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border: 0;
						border-radius: 0;
						padding: 0 10px;
						box-shadow: 4px 4px 0px rgba(255, 221, 144, 0.5);
						outline: none;
						color: #000;
						width: 550px;
						font-size: 14px;
						height: 44px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 0;
						border-radius: 0;
						padding: 0 10px 0 30px;
						box-shadow: 4px 4px 0px rgba(255, 221, 144, 0.5);
						outline: none;
						color: #000;
						width: 100%;
						font-size: 14px;
						height: 44px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 0;
						border-radius: 0;
						padding: 0 10px 0 30px;
						box-shadow: 4px 4px 0px rgba(255, 221, 144, 0.5);
						outline: none;
						color: #000;
						width: 100%;
						font-size: 14px;
						height: 44px;
					}
		
		.rgs-form /deep/ .el-upload--picture-card {
			background: transparent;
			border: 0;
			border-radius: 0;
			width: auto;
			height: auto;
			line-height: initial;
			vertical-align: middle;
		}
		
		.rgs-form /deep/ .upload .upload-img {
		  		  border: 1px dashed rgba(255, 221, 144, 1);
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: rgba(255, 221, 144, 1);
		  		  background: #fff;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 160px;
		  		  text-align: center;
		  		  height: 160px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 1px dashed rgba(255, 221, 144, 1);
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: rgba(255, 221, 144, 1);
		  		  background: #fff;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 160px;
		  		  text-align: center;
		  		  height: 160px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 1px dashed rgba(255, 221, 144, 1);
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: rgba(255, 221, 144, 1);
		  		  background: #fff;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 160px;
		  		  text-align: center;
		  		  height: 160px;
		  		}
	}
</style>
