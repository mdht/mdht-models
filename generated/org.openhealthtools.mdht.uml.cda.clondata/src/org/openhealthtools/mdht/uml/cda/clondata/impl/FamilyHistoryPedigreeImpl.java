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
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree;
import org.openhealthtools.mdht.uml.cda.clondata.operations.FamilyHistoryPedigreeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family History Pedigree</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FamilyHistoryPedigreeImpl extends ActImpl implements FamilyHistoryPedigree {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistoryPedigreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getFamilyHistoryPedigree();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigreeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryPedigreeOperations.validateFamilyHistoryPedigreeTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigreeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryPedigreeOperations.validateFamilyHistoryPedigreeClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigreeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryPedigreeOperations.validateFamilyHistoryPedigreeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigreeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryPedigreeOperations.validateFamilyHistoryPedigreeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigreeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryPedigreeOperations.validateFamilyHistoryPedigreeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigreeReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryPedigreeOperations.validateFamilyHistoryPedigreeReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigreeReferenceExternalObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryPedigreeOperations.validateFamilyHistoryPedigreeReferenceExternalObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigreeReferenceExternalObservationId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryPedigreeOperations.validateFamilyHistoryPedigreeReferenceExternalObservationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigreeReferenceExternalObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryPedigreeOperations.validateFamilyHistoryPedigreeReferenceExternalObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigreeReferenceExternalObservationText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryPedigreeOperations.validateFamilyHistoryPedigreeReferenceExternalObservationText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryPedigree init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryPedigree init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FamilyHistoryPedigreeImpl
