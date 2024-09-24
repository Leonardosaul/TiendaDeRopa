package com.tiendaderopa.tiendaderopa.DTO.Request.Material.ProductoMaterial;

public class UpdateRequest {
    
    private long materialId;

    public UpdateRequest() {
        
    }

    public long getMaterialId() {
        return this.materialId;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }
}
