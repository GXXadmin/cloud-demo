package cn.itcast.order.web;

import cn.itcast.clients.UserClient;
import cn.itcast.order.pojo.Order;
import cn.itcast.order.service.OrderService;
import cn.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("order")
public class OrderController {

   @Autowired
   private OrderService orderService;

   @Autowired
   private RestTemplate restTemplate;

   @Autowired
   private UserClient userClient;


    @GetMapping("{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId,
                                    @RequestHeader(value = "gxx", required = false) String gxx) {
        System.out.println("Gxx+order----->"+gxx);

        // 根据id查询订单并返回
        Order order = orderService.queryOrderById(orderId);

        User user = userClient.findById(order.getUserId());
        order.setUser(user);

        return order;
    }

//    @GetMapping("{orderId}")
//    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId) {
//
//        // 根据id查询订单并返回
//        Order order = orderService.queryOrderById(orderId);
//
//        String url = "http://userserver/user/"+order.getUserId();
//        User user = restTemplate.getForObject(url, User.class);
//        order.setUser(user);
//
//        return order;
//    }



}
