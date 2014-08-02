/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ConsumableImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.ConsumableMaterialOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumable Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConsumableMaterialImpl extends ConsumableImpl implements ConsumableMaterial {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsumableMaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.CONSUMABLE_MATERIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceDeterminerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialingredientRoleingredientSubstanceCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialingredientRoleClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedicationMedicationMaterialingredientRoleAssignedPerson(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialingredientRoleAssignedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedicationMedicationMaterialClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedicationMedicationMaterialCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedicationMedicationMaterialCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedicationMedicationMaterialLotNumberText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialLotNumberText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsumableMaterialMedicationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsumableMaterialOperations.validateConsumableMaterialMedicationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsumableMaterial init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public ConsumableMaterial init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ConsumableMaterialImpl
