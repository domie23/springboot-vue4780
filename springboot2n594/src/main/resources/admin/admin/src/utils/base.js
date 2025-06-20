const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot2n594/",
            name: "springboot2n594",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot2n594/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "课表管理系统"
        } 
    }
}
export default base
