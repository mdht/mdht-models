/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.clondata.BreastCancerProcedures;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.MolecularDiagnosticTestingOrganizer;
import org.openhealthtools.mdht.uml.cda.clondata.ProceduresSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.RadiationTherapyCareCompleted;
import org.openhealthtools.mdht.uml.cda.clondata.operations.ProceduresSectionBCTPSOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.ProceduresSectionEntriesOptionalImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedures Section BCTPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProceduresSectionBCTPSImpl extends ProceduresSectionEntriesOptionalImpl implements ProceduresSectionBCTPS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProceduresSectionBCTPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getProceduresSectionBCTPS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionBCTPSBreastCancerProcedures(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresSectionBCTPSOperations.validateProceduresSectionBCTPSBreastCancerProcedures(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionBCTPSRadiationTherapyCareCompleted(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresSectionBCTPSOperations.validateProceduresSectionBCTPSRadiationTherapyCareCompleted(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastCancerProcedures getBreastCancerProcedures() {
		return ProceduresSectionBCTPSOperations.getBreastCancerProcedures(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadiationTherapyCareCompleted getRadiationTherapyCareCompleted() {
		return ProceduresSectionBCTPSOperations.getRadiationTherapyCareCompleted(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolecularDiagnosticTestingOrganizer getMolecularDiagnosticTestingOrganizer() {
		return ProceduresSectionBCTPSOperations.getMolecularDiagnosticTestingOrganizer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProceduresSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresSectionBCTPSOperations.validateProceduresSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceduresSectionBCTPS init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceduresSectionBCTPS init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProceduresSectionBCTPSImpl
