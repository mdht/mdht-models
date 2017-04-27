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
import org.openhealthtools.mdht.uml.cda.clondata.BreastTNMNodeCategory;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.operations.BreastTNMNodeCategoryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Breast TNM Node Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BreastTNMNodeCategoryImpl extends ObservationImpl implements BreastTNMNodeCategory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreastTNMNodeCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getBreastTNMNodeCategory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMNodeCategoryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMNodeCategoryOperations.validateBreastTNMNodeCategoryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMNodeCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMNodeCategoryOperations.validateBreastTNMNodeCategoryClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMNodeCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMNodeCategoryOperations.validateBreastTNMNodeCategoryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMNodeCategoryEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BreastTNMNodeCategoryOperations.validateBreastTNMNodeCategoryEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMNodeCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMNodeCategoryOperations.validateBreastTNMNodeCategoryMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMNodeCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BreastTNMNodeCategoryOperations.validateBreastTNMNodeCategoryValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastTNMNodeCategory init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastTNMNodeCategory init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // BreastTNMNodeCategoryImpl
