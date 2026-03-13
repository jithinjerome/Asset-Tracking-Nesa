package com.project.assetTracking.Asset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assets")
public class AssetController {

    private final AssetService assetService;
    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }

    @PostMapping
    public Asset createAsset(@RequestBody Asset asset){
        return assetService.createAsset(asset);
    }

    @GetMapping
    public List<Asset> getAllAssets(){
        return assetService.getAllAssets();
    }

    @GetMapping("/{id}")
    public Asset getAssetById(@PathVariable Long id){
        return assetService.getAssetById(id);
    }

    @PatchMapping("/{id}")
    public Asset updateAsset(@PathVariable Long id, @RequestBody Asset asset){
        return assetService.updateAsset(id,asset);
    }

    @DeleteMapping("/{id}")
    public String deleteAsset(@PathVariable Long id){
        assetService.deleteAsset(id);
        return "Asset Deleted Successfully";
    }

}
