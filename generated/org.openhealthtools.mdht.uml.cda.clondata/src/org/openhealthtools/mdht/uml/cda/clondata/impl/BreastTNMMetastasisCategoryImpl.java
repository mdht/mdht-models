/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.clondata.BreastTNMMetastasisCategory;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.operations.BreastTNMMetastasisCategoryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Breast TNM Metastasis Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BreastTNMMetastasisCategoryImpl extends ObservationImpl implements BreastTNMMetastasisCategory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreastTNMMetastasisCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getBreastTNMMetastasisCategory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMMetastasisCategoryTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMMetastasisCategoryOperations.validateBreastTNMMetastasisCategoryTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMMetastasisCategoryClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMMetastasisCategoryOperations.validateBreastTNMMetastasisCategoryClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMMetastasisCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMMetastasisCategoryOperations.validateBreastTNMMetastasisCategoryCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMMetastasisCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMMetastasisCategoryOperations.validateBreastTNMMetastasisCategoryCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMMetastasisCategoryEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMMetastasisCategoryOperations.validateBreastTNMMetastasisCategoryEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMMetastasisCategoryMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMMetastasisCategoryOperations.validateBreastTNMMetastasisCategoryMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMMetastasisCategoryStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMMetastasisCategoryOperations.validateBreastTNMMetastasisCategoryStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMMetastasisCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMMetastasisCategoryOperations.validateBreastTNMMetastasisCategoryValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastTNMMetastasisCategory init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastTNMMetastasisCategory init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // BreastTNMMetastasisCategoryImpl
