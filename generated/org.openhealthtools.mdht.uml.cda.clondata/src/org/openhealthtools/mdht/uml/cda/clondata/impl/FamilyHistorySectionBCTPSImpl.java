/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree;
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistorySectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryofCancerNone;
import org.openhealthtools.mdht.uml.cda.clondata.operations.FamilyHistorySectionBCTPSOperations;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.impl.FamilyHistorySectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family History Section BCTPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FamilyHistorySectionBCTPSImpl extends FamilyHistorySectionImpl implements FamilyHistorySectionBCTPS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistorySectionBCTPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getFamilyHistorySectionBCTPS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySectionBCTPSFamilyHistoryofCancerNone(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistorySectionBCTPSOperations.validateFamilyHistorySectionBCTPSFamilyHistoryofCancerNone(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySectionBCTPSFamilyHistoryPedigree(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistorySectionBCTPSOperations.validateFamilyHistorySectionBCTPSFamilyHistoryPedigree(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySectionBCTPSFamilyHistoryOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistorySectionBCTPSOperations.validateFamilyHistorySectionBCTPSFamilyHistoryOrganizer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryofCancerNone getFamilyHistoryofCancerNone() {
		return FamilyHistorySectionBCTPSOperations.getFamilyHistoryofCancerNone(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryPedigree getFamilyHistoryPedigree() {
		return FamilyHistorySectionBCTPSOperations.getFamilyHistoryPedigree(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryOrganizer getFamilyHistoryOrganizer() {
		return FamilyHistorySectionBCTPSOperations.getFamilyHistoryOrganizer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFamilyHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistorySectionBCTPSOperations.validateFamilyHistorySectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistorySectionBCTPS init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistorySectionBCTPS init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FamilyHistorySectionBCTPSImpl
