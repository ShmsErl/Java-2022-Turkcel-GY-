package LayerDemo.DataAccess.Concretes;

import java.util.List;

import LayerDemo.DataAccess.Abstract.ICampaignDao;
import LayerDemo.Entities.Concretes.Campaign;

public class CampaignDao implements ICampaignDao {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Yeni bir kampanya eklendi : " + "\tAdı : "+ campaign.getCampaignName() +"Oran :" + campaign.getDiscount() );
		
	}

	@Override
	public void update(Campaign campaign, int id) {
		System.out.println("Mevcut" + id+ "li, Kampanya bilgileri güncellendi"+ campaign.getCampaignName()  );
		
	}

	@Override
	public void delete(int id) {
		System.out.println("Veri Tabanından silindi" + id );
		
	}

	@Override
	public List<Campaign> get() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
