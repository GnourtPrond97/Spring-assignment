package com.example.assignment_spring.controller;

import com.example.assignment_spring.model.District;
import com.example.assignment_spring.model.Street;
import com.example.assignment_spring.model.StreetDto;
import com.example.assignment_spring.service.DistrictService;
import com.example.assignment_spring.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/street")
public class StreetController {

    @Autowired
    private DistrictService districtService;
    @Autowired
    private StreetService streetService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloWorld(){
        return "hello world";
    }

    @RequestMapping(value = "/seed/generate",method = RequestMethod.GET)
    public boolean seed(){
        District district1 = new District();
        district1.setName("Thanh xuân Trung");
        districtService.create(district1);
        District district1InDb = districtService.findByName("Thanh xuân Trung");

        Street street1 = new Street();
        street1.setName("Nguy Như Kon Tum");
        street1.setDescription("Tên rất Tây Nguyên nhưng lại ở Hà Nội.");
        street1.setFoundingDate(Calendar.getInstance().getTimeInMillis());
        street1.setStatus(Street.StreetStatus.USING);
        street1.setDistrict(district1InDb);
        streetService.create(street1);

        Street street2 = new Street();
        street2.setName("Vũ Trọng Phụng");
        street2.setDescription("Mới giải tỏa .");
        street2.setFoundingDate(Calendar.getInstance().getTimeInMillis());
        street2.setStatus(Street.StreetStatus.CONSTRUCTION);
        street2.setDistrict(district1InDb);
        streetService.create(street2);
        //--------------------------------------
        District district2 = new District();
        district2.setName("Ba Đình");
        districtService.create(district2);
        District district2InDb = districtService.findByName("Ba Đình");


        Street street3 = new Street();
        street3.setName("Hoàng Diệu");
        street3.setDescription("Đường lắm cây mùa hè đi rất mát.");
        street3.setFoundingDate(Calendar.getInstance().getTimeInMillis());
        street3.setStatus(Street.StreetStatus.USING);
        street3.setDistrict(district2InDb);
        streetService.create(street3);

        Street street4 = new Street();
        street4.setName("Kim Mã");
        street4.setDescription("Từ ngã ba phố Sơn Tây-Nguyễn Thái Học (chỗ bến xe Kim Mã) kéo dài đến phố Cầu Giấy ở ngã ba Voi phục.");
        street4.setFoundingDate(Calendar.getInstance().getTimeInMillis());
        street4.setStatus(Street.StreetStatus.REPAIRING);
        street4.setDistrict(district2InDb);
        streetService.create(street4);
        //--------------------------------------
        District district3 = new District();
        district3.setName("Cầu Giấy");
        districtService.create(district3);
        District district3InDb = districtService.findByName("Cầu Giấy");

        Street street5 = new Street();
        street5.setName("Xuân Thủy");
        street5.setDescription("Có đại học Quốc gia Hà Nội.");
        street5.setFoundingDate(Calendar.getInstance().getTimeInMillis());
        street5.setStatus(Street.StreetStatus.USING);
        street5.setDistrict(district3InDb);
        streetService.create(street5);

        Street street6 = new Street();
        street6.setName("Trần Duy Hưng");
        street6.setDescription(":)");
        street6.setFoundingDate(Calendar.getInstance().getTimeInMillis());
        street6.setStatus(Street.StreetStatus.USING);
        street6.setDistrict(district3InDb);
        streetService.create(street6);

        //--------------------------------------
        District district4 = new District();
        district4.setName("Hoàn Kiếm");
        districtService.create(district4);
        District district4InDb = districtService.findByName("Hoàn Kiếm");

        Street street7 = new Street();
        street7.setName("Tràng Thi");
        street7.setDescription("Đây là một phố được xem như trục chính trong thành phố, nối từ Nhà Khách Chính Phủ (Ngô Quyền - Lê Thạch) đến Phủ Chủ tịch (qua Ngô Quyền - Tràng Tiền -  Hàng Khay - Tràng Thi -  Cửa Nam -  Điện Biên - Ba Đình -  Hoàng Văn Thụ)");
        street7.setFoundingDate(Calendar.getInstance().getTimeInMillis());
        street7.setStatus(Street.StreetStatus.USING);
        street7.setDistrict(district4InDb);
        streetService.create(street7);

        Street street8 = new Street();
        street8.setName("Đinh Tiên Hoàng");
        street8.setDescription("Đinh Tiên Hoàng là một tuyến phố dài và rộng rãi, xe cộ chỉ được chạy một chiều từ nam lên bắc. Bên cạnh Hồ Gươm xanh tươi bốn mùa với Tháp Rùa cổ kính.");
        street8.setFoundingDate(Calendar.getInstance().getTimeInMillis());
        street8.setStatus(Street.StreetStatus.USING);
        street8.setDistrict(district4InDb);
        streetService.create(street8);
        //--------------------------------------
        District district5 = new District();
        district5.setName("Nam Từ Liêm");
        districtService.create(district5);
        District district5InDb = districtService.findByName("Nam Từ Liêm");

        Street street9 = new Street();
        street9.setName("Lê Quang đạo");
        street9.setDescription("Đi qua sân vận động Mĩ Đình.");
        street9.setFoundingDate(Calendar.getInstance().getTimeInMillis());
        street9.setStatus(Street.StreetStatus.REPAIRING);
        street9.setDistrict(district5InDb);
        streetService.create(street9);

        Street street10 = new Street();
        street10.setName("Đỗ Xuân Hợp");
        street10.setDescription(" Phía sau sân vận động Mĩ Đình.");
        street10.setFoundingDate(Calendar.getInstance().getTimeInMillis());
        street10.setStatus(Street.StreetStatus.CONSTRUCTION);
        street10.setDistrict(district5InDb);
        streetService.create(street10);

        return true;
    }
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public void create(@RequestBody StreetDto streetDto){
        Street street = new Street();
        street.setName(streetDto.getName());
        street.setFoundingDate( Long.valueOf(streetDto.getFoundingDate()) );
        street.setDescription(streetDto.getDescription());
        street.setStatus(Street.enumValueOfStringStreetStatus(streetDto.getStatus()));
        street.setDistrict(districtService.findById(Integer.valueOf(streetDto.getDistrictId())));

        streetService.create(street);
//        StreetDto streetDto1 =  new StreetDto(streetService.findByName(streetDto.getName()));
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Iterable<StreetDto> list(@RequestParam( name = "districtId",required = false) Integer districtId,
                                    @RequestParam( name = "name" ,required = false) String name){
        List<Street> list = streetService.findByNameOrDistricId(districtId,name);
        return list.stream().map(s -> new StreetDto(s)).collect(Collectors.toList());
    }
}
