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
import org.openhealthtools.mdht.uml.cda.clondata.BreastTNMTumorCategory;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.operations.BreastTNMTumorCategoryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Breast TNM Tumor Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BreastTNMTumorCategoryImpl extends ObservationImpl implements BreastTNMTumorCategory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreastTNMTumorCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getBreastTNMTumorCategory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategoryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMTumorCategoryOperations.validateBreastTNMTumorCategoryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMTumorCategoryOperations.validateBreastTNMTumorCategoryClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMTumorCategoryOperations.validateBreastTNMTumorCategoryCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMTumorCategoryOperations.validateBreastTNMTumorCategoryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategoryEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMTumorCategoryOperations.validateBreastTNMTumorCategoryEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMTumorCategoryOperations.validateBreastTNMTumorCategoryMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategoryStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMTumorCategoryOperations.validateBreastTNMTumorCategoryStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMTumorCategoryOperations.validateBreastTNMTumorCategoryValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategoryValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMTumorCategoryOperations.validateBreastTNMTumorCategoryValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastTNMTumorCategory init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastTNMTumorCategory init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // BreastTNMTumorCategoryImpl
