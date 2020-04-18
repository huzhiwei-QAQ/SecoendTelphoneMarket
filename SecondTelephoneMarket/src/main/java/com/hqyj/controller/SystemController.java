package com.hqyj.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.VoiceStatus;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hqyj.dao.ProductSaledMapper;
import com.hqyj.dao.ResourcesManageMapper;
import com.hqyj.entity.Customer;
import com.hqyj.entity.Email;
import com.hqyj.entity.Goods;
import com.hqyj.entity.GoodsExported;
import com.hqyj.entity.GoodsIn;
import com.hqyj.entity.GoodsStatistics;
import com.hqyj.entity.NewUser;
import com.hqyj.entity.Notice;
import com.hqyj.entity.Order;
import com.hqyj.entity.Product;
import com.hqyj.entity.ProductSaled;
import com.hqyj.entity.Purchase;
import com.hqyj.entity.PurchaseOrders;
import com.hqyj.entity.ResourcesManage;
import com.hqyj.entity.Role;
import com.hqyj.entity.Supplier;
import com.hqyj.entity.User;
import com.hqyj.entity.UserRole;
import com.hqyj.service.CustomerService;
import com.hqyj.service.GoodsExportedService;
import com.hqyj.service.GoodsInService;
import com.hqyj.service.GoodsService;
import com.hqyj.service.GoodsStatisticsService;
import com.hqyj.service.NewUserService;
import com.hqyj.service.NoticeService;
import com.hqyj.service.OrderService;
import com.hqyj.service.ProductSaledService;
import com.hqyj.service.ProductService;
import com.hqyj.service.PurchaseOrdersService;
import com.hqyj.service.PurchaseService;
import com.hqyj.service.ResourcesManageService;
import com.hqyj.service.RoleService;
import com.hqyj.service.SupplierService;
import com.hqyj.service.TimeService;
import com.hqyj.service.UserRoleService;
import com.hqyj.service.UserService;
import com.sun.mail.handlers.text_html;

import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



@Controller
public class SystemController {
	@Autowired
	private ProductService productService;
	@Autowired
	private SupplierService supplierService;
	@Autowired
	private GoodsService goodsService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private ProductSaledService productSaledMapper;
	@Autowired
	private GoodsExportedService goodsExportedService;
	@Autowired
	private PurchaseOrdersService purchaseOrdersService;
	@Autowired
	private PurchaseService purchaseService;
	@Autowired
	private GoodsInService goodsInService;
	@Autowired
	private GoodsStatisticsService goodsStatisticsService;
	@Autowired
	private NewUserService newUserService;
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private UserRoleService userRoleService;
	@Autowired
	private NoticeService noticeService;
     @Autowired
    private ResourcesManageService resourcesManageService;
     @Autowired
     private TimeService timeService;


	// 查询所有产品
	@RequestMapping(value = "/getProduct", method = RequestMethod.GET)
	public void selectAllProduct(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");

		List<Product> selectAll = productService.selectAll();
		req.setAttribute("selectAll", selectAll);
		req.getRequestDispatcher("product.jsp").forward(req, resp);
	}

	// 查询所用供应商
	@RequestMapping(value = "/getSupplier", method = RequestMethod.GET)
	public void selectAllsupplier(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");

		List<Supplier> selectAllSupplier = supplierService.selectAllSupplier();
		req.setAttribute("selectAllSupplier", selectAllSupplier);
		req.getRequestDispatcher("supplier.jsp").forward(req, resp);
	}

	// 查询所有商品
	@RequestMapping(value = "/getGoods", method = RequestMethod.GET)
	public void selectAllgoods(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");

		List<Goods> selectAllGoods = goodsService.selectAllGoods();
		req.setAttribute("selectAllGoods", selectAllGoods);
		req.getRequestDispatcher("goods.jsp").forward(req, resp);
	}

	// 查询所有客户
	@RequestMapping(value = "/getCustomer", method = RequestMethod.GET)
	public void selectAllcustomer(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");

		List<Customer> selectAllCustomer = customerService.selectAllCustomer();
		req.setAttribute("selectAllCustomer", selectAllCustomer);
		req.getRequestDispatcher("customer.jsp").forward(req, resp);
	}

	// 跳转到销售管理页面
	@RequestMapping(value = "/intoorder", method = RequestMethod.GET)
	public String intoOrder(HttpServletRequest req, HttpServletResponse resp) {

		return "order";
	}

	// 添加产品订单
	@RequestMapping(value = "/getOrder", method = RequestMethod.POST)
	public String insertIntoOrder(String name, String type, int number)
			throws UnsupportedEncodingException, InterruptedException {
		Order order = new Order();
		order.setName(name);
		order.setType(type);
		order.setNum(number);
		// 添加到待销售订单
		orderService.insertOrder(order);
		Customer customer = new Customer();
		customer.setName(name);
		customer.setType(type);
		customer.setNum(number);
		// 添加到客户
		customerService.addCustomer(customer);
		Thread thread = new Thread();// 休眠两秒
		thread.sleep(2000);
		return "redirect:selectAllNotices";
	}

	// 查看待销售订单
	@RequestMapping(value = "/selectOrders", method = RequestMethod.GET)
	public void selectAllorder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");

		List<Order> selectAllOrder = orderService.selectAllOrder();
		req.setAttribute("selectAllOrder", selectAllOrder);
		req.getRequestDispatcher("selectorders.jsp").forward(req, resp);
	}

	// 销售统计查询
	@RequestMapping(value = "/selectAllProductsaled", method = RequestMethod.GET)
	public void selectAllProductSaled(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		List<ProductSaled> selectAllProductSaled = productSaledMapper.selectAllProductSaled();
		req.setAttribute("selectAllProductSaled", selectAllProductSaled);
		req.getRequestDispatcher("productSaled.jsp").forward(req, resp);

	}

	// 查询销售订单和采购订单
	@RequestMapping(value = "/selectAllorder", method = RequestMethod.GET)
	public String selectAllOrders(HttpServletRequest req, HttpServletResponse resp) {
		// 查询销售订单
		List<Customer> selectAllCustomer = customerService.selectAllCustomer();
		req.setAttribute("selectAllCustomer", selectAllCustomer);
		// 采购订单
		List<Purchase> selectPurchase = purchaseService.selectPurchase();
		req.setAttribute("selectPurchase", selectPurchase);

		return "AllOrder";

	}

	// 跳转待销售订单和待采购订单管理页面
	@RequestMapping(value = "/orderManage", method = RequestMethod.GET)
	public String getOrderManage(HttpServletRequest req, HttpServletResponse resp) {
		// 查询待销售订单
		List<Order> selectAllOrder = orderService.selectAllOrder();
		req.setAttribute("selectAllOrder", selectAllOrder);
		// 查询待采购订单
		List<PurchaseOrders> selectPurchaseOrders = purchaseOrdersService.selectPurchaseOrders();
		req.setAttribute("selectPurchaseOrders", selectPurchaseOrders);

		return "ordermanager";

	}

	// 删除待销售订单
	@RequestMapping(value = "/deletorders", method = RequestMethod.POST)
	public String deletOrderbyname(String name, HttpServletRequest req, HttpServletResponse resp) {
		// 添加出库商品
		orderService.addGoodsExported(name);

		orderService.deletOrder(name);
		// 使用重定向跳转到上一个方法
		return "redirect:orderManage";

	}

	// 跳转到产品出库商品管理页面
	@RequestMapping(value = "/GetGoodsExportedManage", method = RequestMethod.GET)
	public String getGoodsExportedManage(HttpServletRequest req, HttpServletResponse resp) {
		List<GoodsExported> selectGoodsExported = goodsExportedService.selectGoodsExported();
		req.setAttribute("selectGoodsExported", selectGoodsExported);

		return "GoodsExportedManage";
	}

	// 处理产品出库出库订单
	@RequestMapping(value = "/goodsExportedManageForm", method = RequestMethod.POST)
	public String goodsExportedManageform(String type, int num) throws Exception {

			// 增加销售产品统计订单
			ProductSaled productSaled = new ProductSaled();
			productSaled.setType(type);
			productSaled.setNum(num);
			productSaledMapper.updateProductSaledNum(productSaled);
			// 增加某机型的总销售额
			productSaledMapper.updateProductSaledNumprice(productSaled);
			// 减少产品库存数
			Product product = new Product();
			product.setP_type(type);
			product.setP_num(num);
			productService.updateProductNum(product);
			// 删除出库订单
			goodsExportedService.deletGoodsExported(type);

		return "redirect:GetGoodsExportedManage";
	}

	// 库存统计查询（商品库存和产品库存）
	@RequestMapping(value = "/GetGoodsAndProduct", method = RequestMethod.GET)
	public String selectRepertory(HttpServletRequest req, HttpServletResponse resp) {
		// 查看产品库存
		List<Product> selectAll = productService.selectAll();
		req.setAttribute("selectAll", selectAll);
		// 查看商品库存
		List<Goods> selectAllGoods = goodsService.selectAllGoods();
		req.setAttribute("selectAllGoods", selectAllGoods);

		return "SelectRepertory";
	}

	// 跳转到增加待采购订单页面
	@RequestMapping(value = "getPurchaseorders", method = RequestMethod.GET)
	public String getPurchaseOrders() {

		return "GetPurchaseOrders";
	}

	// 添加商品订单
	@RequestMapping(value = "merchandiseorder", method = RequestMethod.POST)
	public String merchandiseOrder(HttpServletRequest req, HttpServletResponse resp, String type, int num,
			String supplier) throws InterruptedException {
		// 添加待采购订单
		PurchaseOrders purchaseOrders = new PurchaseOrders();
		purchaseOrders.setType(type);
		purchaseOrders.setNum(num);
		purchaseOrders.setSupplier(supplier);
		purchaseOrdersService.addPurchaseOrders(purchaseOrders);
		// 添加采购订单
		Purchase purchase = new Purchase();
		purchase.setType(type);
		purchase.setSupplier(supplier);
		purchase.setNum(num);
		purchaseService.insertPurchase(purchase);
		Thread thread = new Thread();// 休眠两秒
		thread.sleep(2000);
		return "redirect:selectAllNotices";
	}

	// 查看待采购订单
	@RequestMapping(value = "selectPurchaseorder", method = RequestMethod.GET)
	public String selectPurchaseOrder(HttpServletRequest req, HttpServletResponse resp) {
		List<PurchaseOrders> selectPurchaseOrders = purchaseOrdersService.selectPurchaseOrders();
		req.setAttribute("selectPurchaseOrders", selectPurchaseOrders);
		return "SelectPurchaseOrder";

	}

	// 删除待采购订单
	@RequestMapping(value = "deletgoodsorder", method = RequestMethod.POST)
	public String deleteGoodsOrders(String supplier) {
		// 增加采购入库订单
		purchaseOrdersService.addWarehousing(supplier);
		// 删除待采购订单
		purchaseOrdersService.deleteaddPurchaseOrders(supplier);
		return "redirect:orderManage";

	}

	// 跳转到商品入库页面
	@RequestMapping(value = "getaddwarehousing", method = RequestMethod.GET)
	public String getaddWarehousing(HttpServletRequest req, HttpServletResponse resp) {
		List<GoodsIn> selectGoodsIn = goodsInService.selectGoodsIn();
		req.setAttribute("selectGoodsIn", selectGoodsIn);
		return "SelectGoodsIn";
	}

	// 处理商品入库订单
	@RequestMapping(value = "handlegoodsLn", method = RequestMethod.POST)
	public String handleGoodsLn(String type, int num) {
		// 增加采购统计量
		GoodsStatistics goodsStatistics = new GoodsStatistics();
		goodsStatistics.setType(type);
		goodsStatistics.setNum(num);
		// 增加商品入库数
		goodsStatisticsService.updateGoodsStatistics(goodsStatistics);
		// 增加该机型的总采购价
		goodsStatisticsService.updateGoodsStatisticsPrice(goodsStatistics);
		// 增加商品库存
		Goods goods = new Goods();
		goods.setG_type(type);
		goods.setG_num(num);
		goodsService.updateGoods(goods);
		// 删除商品入库订单
		goodsInService.deletGoodsIn(type);
		return "redirect:getaddwarehousing";
	}

	// 采购统计查询
	@RequestMapping(value = "selectAllGoodsstatistics", method = RequestMethod.GET)
	public String selectAllGoodsStatistics(HttpServletRequest req, HttpServletResponse resp) {
		List<GoodsStatistics> selectGoodsStatistics = goodsStatisticsService.selectGoodsStatistics();
		req.setAttribute("selectGoodsStatistics", selectGoodsStatistics);
		return "SelectAllGoodsStatistics";
	}

	// 跳转到商品出库（产品入库）页面
	@RequestMapping(value = "getGoodsAndproduct", method = RequestMethod.GET)
	public String getGoodsAndProduct(HttpServletRequest req, HttpServletResponse resp) {
		// 查看产品库存
		List<Product> selectAll = productService.selectAll();
		req.setAttribute("selectAll", selectAll);
		// 查看商品库存
		List<Goods> selectAllGoods = goodsService.selectAllGoods();
		req.setAttribute("selectAllGoods", selectAllGoods);

		return "GetGoodsAndProduct";

	}

	// 商品出库（产品入库)
	@RequestMapping(value = "goodsAndProduct", method = RequestMethod.POST)
	public String GoodsAndProduct(String type, int num) {
		// 商品出库
		Goods goods = new Goods();
		goods.setG_type(type);
		goods.setG_num(num);
		goodsService.updateGoodsNum(goods);
		// 产品入库
		Product product = new Product();
		product.setP_type(type);
		product.setP_num(num);
		productService.updateProduct(product);
		return "redirect:getGoodsAndproduct";
	}

	@RequestMapping(value="gettime",method=RequestMethod.POST) 
	public void gettime(@RequestBody Map<String,Date>map){
		 System.out.println("map:"+map);
		  Date date=	map.get("time");
		  System.out.println("date:"+date);
		  SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		  String time= simpleDateFormat.format(date);
		  System.out.println(time);
		  timeService.setTime(time);
		 
		System.out.println("时间是："+ timeService.gettime(1));
	}
	
	// 查询某机型采购结款
	@RequestMapping(value = "selectpurchasestatement", method = RequestMethod.POST)
	@ResponseBody
	public GoodsStatistics selectPurchaseStatement(@RequestBody Map<String, String> map, HttpServletRequest req, HttpServletResponse resp)
			throws UnsupportedEncodingException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		System.out.println("type:"+map);
	String types= map.get("type");
		GoodsStatistics selectGoodsStatisticsOne = goodsStatisticsService.selectGoodsStatisticsOne(types);
		return selectGoodsStatisticsOne;
	}

	// 查询所有机型总采购结款
	@RequestMapping(value = "selectcount1", method = RequestMethod.POST)
	@ResponseBody
	public GoodsStatistics selectCount1() {
		GoodsStatistics selectCount1 = goodsStatisticsService.selectCount1();
		System.out.println(selectCount1);
		return selectCount1;
	}

	// 查询某机型销售结款
	@RequestMapping(value = "selectsalespayment", method = RequestMethod.POST)
	@ResponseBody
	public ProductSaled selectSalesPayment(@RequestParam String types) {
		ProductSaled selectProductSaledOne = productSaledMapper.selectProductSaledOne(types);
		return selectProductSaledOne;
	}

	// 查询所有机型销售结款
	@RequestMapping(value = "selectcount2", method = RequestMethod.POST)
	@ResponseBody
	public ProductSaled selectCount2() {
		ProductSaled selectCount2 = productSaledMapper.selectCount2();
		return selectCount2;
	}
	//跳转到添加员工页面
	@RequestMapping(value = "getaddNewUser", method = RequestMethod.GET)
	public String getAddNewUser(){
		return "register";
		
	}
	
	//添加新员工
	@RequestMapping(value = "/addnewusers", method = RequestMethod.POST)
	public String addNewUsers(String name,String password,String roles,String email) throws InterruptedException{
		//将密码加盐加密
		Object hashedCredentials = new SimpleHash("MD5", password, name, 1024);
		NewUser newUser=new NewUser();
		newUser.setPassword(hashedCredentials.toString());
		newUser.setName(name);
		newUser.setRoles(roles);
		newUser.setEmail(email);
		newUserService.addNewUser(newUser);
		Thread thread = new Thread();// 休眠两秒
		thread.sleep(2000);
		return "login";
	}
	//查看所有的待添加员工并管理
	@RequestMapping(value = "/selectallnewuser", method = RequestMethod.GET)
	public String selectAllNewUser(HttpServletRequest req,HttpServletResponse resp){
		List<NewUser> selectNewUser = newUserService.selectNewUser();
		req.setAttribute("selectNewUser", selectNewUser);
		return "SelectAllNewUser";
	}
	//添加员工
	@RequestMapping(value = "/insertuser", method = RequestMethod.POST)
	public String insertUser(String name){
		//将待添加员工添加到员工表
	  newUserService.addUser(name);
	  //查询待添加员工角色
	  NewUser selectNewUserOne = newUserService.selectNewUserOne(name);
	  System.out.println("待添加用户的角色："+ selectNewUserOne.getRoles());
	  //查询用户ID
	  User selectUser = userService.selectUser(name);
	  System.out.println("新添加的用户ID:"+selectUser.getU_id());
	  //查询角色ID
	  Role selectRole = roleService.selectRole(selectNewUserOne.getRoles());
	  System.out.println("角色id:"+selectRole.getR_id());
	  //将用户id和角色id加入用户角色关联表
	  UserRole userRole=new UserRole();
	  userRole.setU_id(selectUser.getU_id());
	  userRole.setR_id(selectRole.getR_id());
	  userRoleService.addUserRole(userRole);
	//删除待添加员工
	  newUserService.deletNewUser(name);
		return "redirect:selectallnewuser";
	}
	//查询所有员工信息
	@RequestMapping(value = "/selectallUser", method = RequestMethod.GET)
	public String selectAllUser(HttpServletRequest req,HttpServletResponse resp){
		List<User> selectUserAll = userService.selectUserAll();
		System.out.println(selectUserAll);
		req.setAttribute("selectUserAll", selectUserAll);
		return "SelectAllUser";	
	}
	//分页查询
	@RequestMapping(value = "/selectAllNotices", method = RequestMethod.GET)
	public String selectAllNotices(HttpServletRequest req,HttpServletResponse resp,@RequestParam(value="page",defaultValue="1")int page){
		//引入pagehelper分页插件 ，传入页码以及页码大小
		PageHelper.startPage(page,5);
		//查询信息
		List<Notice> selectAllNotice = noticeService.selectAllNotice();
		System.out.println(selectAllNotice);
		//使用pageinfo包装查询结果,并传入连续显示的页数
		PageInfo pageInfo=new PageInfo(selectAllNotice,5);
		System.out.println(pageInfo);
req.setAttribute("pageInfo", pageInfo);
		return "success";
		
	}
	//跳转员工信息管理页面
	@RequestMapping(value = "/getUserInformationmanage", method = RequestMethod.GET)
	public String getUserInformationManage(HttpServletRequest req,HttpServletResponse resp){	
		List<User> selectUserAll = userService.selectUserAll();
		System.out.println(selectUserAll);
		req.setAttribute("selectUserAll", selectUserAll);
		return "GetUserInformationManage";	
	}
	//辞退员工
	@RequestMapping(value = "/deleteUserbyusername", method = RequestMethod.POST)
	public String deleteUserbyUserName(String username){
	//查询出用户id
		User selectUser = userService.selectUser(username);
		//根据删除用户权限外键表中的信息
	  userRoleService.deletUserRole(selectUser.getU_id());
	  //删除用户表中的用户信息
	  userService.deleteUserbyName(username);
		
		return "redirect:getUserInformationmanage";
		
	}
	//改变员工的职位
	@RequestMapping(value = "/changeUserrole", method = RequestMethod.POST)
	public String changeUserRole(String username,String role){
		//根据用户名查出用户ID
		User selectUser = userService.selectUser(username);
		//根据角色查询角色ID
		Role selectRole = roleService.selectRole(role);
		UserRole userRole=new UserRole();
		userRole.setU_id(selectUser.getU_id());
		userRole.setR_id(selectRole.getR_id());
		//改变用户角色外键表中的角色ID
		userRoleService.updateUserRole(userRole);
		return "redirect:getUserInformationmanage";		
	}
	//查询所有的职位展示在下拉框中
	@RequestMapping(value = "/selectAllRolesbyajax", method = RequestMethod.POST)
	@ResponseBody
	public List<Role> selectAllRolesbyAjax(){
		List<Role> selectAllRole = roleService.selectAllRole();
		return selectAllRole;
		
	}
	
	//查询所有商品展示在下拉框中
	@RequestMapping(value = "/selectAllGoodsByajax", method = RequestMethod.POST)
	@ResponseBody
	public List<Goods> selectAllGoodsByAjax(){
		List<Goods> selectAllGoods = goodsService.selectAllGoods();
		return selectAllGoods;
	}
	
	//查询供应商展示在下拉框中
	@RequestMapping(value = "/selectAllSupplierByajax", method = RequestMethod.POST)
	@ResponseBody
	public List<Supplier> selectAllSupplierByAjax(){
		List<Supplier> selectAllSupplier = supplierService.selectAllSupplier();
		
		return selectAllSupplier;
		
	}
	
	//通过ajax查询待采购订单
	@RequestMapping(value = "/selectPurchaseOrdersbyajax", method = RequestMethod.POST)
	@ResponseBody
	public List<PurchaseOrders> selectPurchaseOrdersbyAjax(){
		List<PurchaseOrders> selectPurchaseOrders = purchaseOrdersService.selectPurchaseOrders();
		return selectPurchaseOrders;
		
	}
	//通过ajax查询待采购订单
	@RequestMapping(value = "/selectOrderByajax", method = RequestMethod.POST)
	@ResponseBody
	public List<Order> selectOrderByAjax(){
		List<Order> selectAllOrder = orderService.selectAllOrder();
		
		return selectAllOrder;
		
	}
	
	//通过AJAX查询入库商品
	@RequestMapping(value = "/selectGoodsInByajax", method = RequestMethod.POST)
	@ResponseBody
	public List<GoodsIn> selectGoodsInByAjax(){
		List<GoodsIn> selectGoodsIn = goodsInService.selectGoodsIn();
		return selectGoodsIn;
		
	}
	
	//通过ajax查询出库产品
	@RequestMapping(value = "/selectGoodsExportedByajax", method = RequestMethod.POST)
	@ResponseBody
	public List<GoodsExported> selectGoodsExportedByAjax(){
		List<GoodsExported> selectGoodsExported = goodsExportedService.selectGoodsExported();
		
		
		return selectGoodsExported;
		
	}
	//通过ajax查询待注册员工
	@RequestMapping(value = "/selectNewUserByajax", method = RequestMethod.POST)
	@ResponseBody
	public List<NewUser>selectNewUserByAjax(){
		List<NewUser> selectNewUser = newUserService.selectNewUser();
		return selectNewUser;
		
	}
	
	//通过ajax查询所有员工
	@RequestMapping(value = "/selectUserByajax", method = RequestMethod.POST)
	@ResponseBody
	public List<User> selectUserByAjax(){
		List<User> selectUserAll = userService.selectUserAll();
		return selectUserAll;
		
	}
	
	//返回主页按钮
	@RequestMapping(value="/getindex",method=RequestMethod.GET)
	public String getIndex(){
		return "redirect:selectAllNotices";	
	}
	
	 //查看所有在售手机信息
	@RequestMapping(value="/selectallPhoneInformation",method=RequestMethod.GET)
	public String selectAllPhoneInformation(HttpServletRequest req,HttpServletResponse resp){
	List<ResourcesManage> selectAllNewResources = resourcesManageService.selectAllNewResources();

		req.setAttribute("selectAllNewResources", selectAllNewResources);
		return "SelectAllPhoneInformation";
		
	}
	//进入手机管理页面
	@RequestMapping(value="/getTelphonemanage",method=RequestMethod.GET)
	public String getTelphoneManage(HttpServletRequest req,HttpServletResponse resp){
		List<ResourcesManage> selectAllNewResources = resourcesManageService.selectAllNewResources();
		req.setAttribute("selectAllNewResources", selectAllNewResources);
		return "GetTelphoneManage";
		
	}
	//增加手机类型
	@RequestMapping(value="/addtelphone",method=RequestMethod.POST)
	@ResponseBody
	public int addTelphone(String type,String supplier,double purchaseprice,double sellingprice,String discription,MultipartFile  file) throws IllegalStateException, IOException{
			// 设置图片名称，不能重复，可以使用uuid
		String picName = UUID.randomUUID().toString();
		System.out.println(picName);
		// 获取文件名
		String oriName = file.getOriginalFilename();
		System.out.println(oriName);
		// 获取图片后缀
		String extName = oriName.substring(oriName.lastIndexOf("."));
		// 开始上传 准备移动
		file.transferTo(new File("F:/program files/git-repository/SecondTelephoneMarket/src/main/webapp/img/" + picName + extName));

		ResourcesManage resourcesManage=new ResourcesManage();
		resourcesManage.setType(type);
		resourcesManage.setSupplier(supplier);
		resourcesManage.setPurchasePrice(purchaseprice);
		resourcesManage.setSellingPrice(sellingprice);
		resourcesManage.setDiscription(discription);
		resourcesManage.setPath("/SecondTelephoneMarket/img/" + picName + extName);
		int addNewResources = resourcesManageService.addNewResources(resourcesManage);
	    //往采购商品表增加新机型
		resourcesManageService.insertGoods(type);
		   //往商品采购结算表中增加新机型
		resourcesManageService.insertGoodsStatistics(type);
		  //往产品表中增加新机型
		resourcesManageService.insertProduct(type);
	    //往产品结算表中增加新机型
		resourcesManageService.insertproductSaled(type);
		return addNewResources;
		
	}
	
	@RequestMapping(value="/getNewPassword",method=RequestMethod.GET)
	public String getPassword(){
		return "GetNewPassword";
	}
	
	//发送验证码
	@RequestMapping(value="/getverificationCode",method=RequestMethod.POST)
	@ResponseBody
	public int getVerificationCode(String username,String email,HttpServletRequest req,HttpServletResponse resp) throws AddressException, MessagingException{
		
		
		//判断用户邮箱是否正确
		if(userService.selectUser(username).getEmail().equals(email)){
			
			StringBuilder str = new StringBuilder();
	        Random random = new Random();
	        for (int i = 0; i < 6; i++) {
	            str.append(random.nextInt(10));
	            }
	        //将验证码放入用户表
	        User user=new User();
	        user.setUsername(username);
	        user.setVerificationCode(str.toString());
	       userService.updateVerificationCode(user); 
	        

			Email mail=new Email();
			//发件人邮箱地址
			mail.setSender("huzhiwe1@163.com");
			//邮箱账号
			mail.setUserName("huzhiwe1");
		    //邮箱客户端授权码
			mail.setPassword("1733296693qaz");
			//创建邮件对象
			Session session=null;
			Properties properties=new Properties();
			//发送方邮件服务器地址，要根据邮箱的不同需要自行设置
			properties.put("mail.smtp.host", "smtp.163.com");
			properties.setProperty("mail.transport.protocol", "smtp");
			properties.put("mail.smtp.port", "25");
			 //设置成需要邮件服务器认证
			properties.put("mail.smtp.auth","true");
			properties.put("mail.debug","true");
			session=Session.getInstance(properties);
			session.setDebug(true);
			Message message = new MimeMessage(session);
	        // 设置发件人
	message.setFrom(new InternetAddress(mail.getSender()));
	        // 设置收件人
	message.addRecipient(RecipientType.TO, new InternetAddress(email));
	// 设置标题
	message.setSubject("重制密码");
	//邮件内容
	message.setContent("<p>尊敬的"+username+"用户：</p><p>您好!</p><p>您正在尝试重置密码！"
	        +"您的验证码是："+str+"。</p><p>请妥善保管您的账号和密码。</p>", "text/html;charset=utf-8");
	//发送邮件
	Transport transport=session.getTransport("smtp");
	transport.connect("smtp.163.com",mail.getUserName(),mail.getPassword());//以smtp方式登录邮箱
	//发送邮件,其中第二个参数是所有已设好的收件人地址
	transport.sendMessage(message,message.getAllRecipients());
	transport.close();
	//将姓名装入session,给服务器使用
	req.getSession().setAttribute("username", username);
	return 1;
		}else {
			return 0;
		}
	}
	
	
	//跳转到重制密码页面
	@RequestMapping(value="/getnewPassWordPage",method=RequestMethod.POST)
	public String getNewPassWordPage(String username,String VerificationCode,HttpServletRequest req,HttpServletResponse resp) throws UnsupportedEncodingException{
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//验证验证码是否正确
		if(userService.selectUser(username).getVerificationCode().equals(VerificationCode)){
			return  "GetNewPassWordPage";
		}else {
			return "验证码输入错误，请重试";
		}	
	}
	//设置新密码
	@RequestMapping(value="/setnewPassWord",method=RequestMethod.POST)
	public String setNewPassWord(HttpServletRequest req,HttpServletResponse resp,String password) throws InterruptedException{
		//取出session中被装入的姓名
	String name=(String) req.getSession().getAttribute("username");
	//将密码加盐加密
	Object hashedCredentials = new SimpleHash("MD5", password, name, 1024);
	User user=new User();
	user.setUsername(name);
	user.setPassword(hashedCredentials.toString());
		userService.updatePassword(user);
		
		Thread thread = new Thread();// 休眠两秒
		thread.sleep(2000);
		 return "redirect:login.jsp";	

	}

	
}



