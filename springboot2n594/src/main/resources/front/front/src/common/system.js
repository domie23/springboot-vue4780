export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除","查看评论","导出","导入"],"menu":"班级课表","menuJump":"列表","tableName":"banjikebiao"}],"menu":"班级课表管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除"],"menu":"教室信息","menuJump":"列表","tableName":"jiaoshixinxi"}],"menu":"教室信息管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除","查看评论"],"menu":"课程信息","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除","审核"],"menu":"调课申请","menuJump":"列表","tableName":"diaokeshenqing"}],"menu":"调课申请管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"校园资讯","tableName":"news"},{"appFrontIcon":"cuIcon-pic","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"班级课表列表","menuJump":"列表","tableName":"banjikebiao"}],"menu":"班级课表模块"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看"],"menu":"教室信息列表","menuJump":"列表","tableName":"jiaoshixinxi"}],"menu":"教室信息模块"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"班级课表列表","menuJump":"列表","tableName":"banjikebiao"}],"menu":"班级课表模块"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看"],"menu":"教室信息列表","menuJump":"列表","tableName":"jiaoshixinxi"}],"menu":"教室信息模块"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除","查看评论"],"menu":"班级课表","menuJump":"列表","tableName":"banjikebiao"}],"menu":"班级课表管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除","查看评论"],"menu":"课程信息","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除"],"menu":"调课申请","menuJump":"列表","tableName":"diaokeshenqing"}],"menu":"调课申请管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"班级课表列表","menuJump":"列表","tableName":"banjikebiao"}],"menu":"班级课表模块"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看"],"menu":"教室信息列表","menuJump":"列表","tableName":"jiaoshixinxi"}],"menu":"教室信息模块"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"教师","tableName":"jiaoshi"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}
