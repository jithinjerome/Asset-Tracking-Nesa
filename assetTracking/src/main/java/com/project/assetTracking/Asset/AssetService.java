package com.project.assetTracking.Asset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetService {

    @Autowired
    private AssetRepository assetRepository;

    public Asset createAsset(Asset asset) {
        return assetRepository.save(asset);
    }

    public List<Asset> getAllAssets() {
        return assetRepository.findByDeletedFalse();
    }

    public Asset getAssetById(Long id) {
        Asset asset = assetRepository.findByIdAndDeletedFalse(id);
        if(asset == null){
            throw new RuntimeException("Asset not found with id: " + id);
        }
        return asset;
    }

    public Asset updateAsset(Long id, Asset asset) {
        Asset asset1 = getAssetById(id);
        if(asset.getName() != null){
            asset1.setName(asset.getName());
        }
        if(asset.getType() != null){
            asset1.setType(asset.getType());
        }
        return assetRepository.save(asset1);
    }

    public void deleteAsset(Long id) {
        Asset asset = getAssetById(id);
        asset.setDeleted(true);
        assetRepository.save(asset);
    }


}
