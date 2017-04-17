/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.operations.BreastTNMClinicalCategoryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Breast TNM Clinical Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BreastTNMClinicalCategoryImpl extends ActImpl implements BreastTNMClinicalCategory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreastTNMClinicalCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getBreastTNMClinicalCategory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategoryTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMClinicalCategoryOperations.validateBreastTNMClinicalCategoryTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategoryClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMClinicalCategoryOperations.validateBreastTNMClinicalCategoryClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMClinicalCategoryOperations.validateBreastTNMClinicalCategoryCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMClinicalCategoryOperations.validateBreastTNMClinicalCategoryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategoryEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMClinicalCategoryOperations.validateBreastTNMClinicalCategoryEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategoryId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMClinicalCategoryOperations.validateBreastTNMClinicalCategoryId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMClinicalCategoryOperations.validateBreastTNMClinicalCategoryMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategoryEntryRelationshipObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMClinicalCategoryOperations.validateBreastTNMClinicalCategoryEntryRelationshipObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategoryEntryRelationshipObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMClinicalCategoryOperations.validateBreastTNMClinicalCategoryEntryRelationshipObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategoryEntryRelationshipObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMClinicalCategoryOperations.validateBreastTNMClinicalCategoryEntryRelationshipObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategoryEntryRelationshipObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMClinicalCategoryOperations.validateBreastTNMClinicalCategoryEntryRelationshipObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMClinicalCategoryOperations.validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMClinicalCategoryOperations.validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategoryEntryRelationshipObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMClinicalCategoryOperations.validateBreastTNMClinicalCategoryEntryRelationshipObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategoryEntryRelationshipTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMClinicalCategoryOperations.validateBreastTNMClinicalCategoryEntryRelationshipTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategoryEntryRelationshipObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMClinicalCategoryOperations.validateBreastTNMClinicalCategoryEntryRelationshipObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastTNMClinicalCategory init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastTNMClinicalCategory init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // BreastTNMClinicalCategoryImpl
