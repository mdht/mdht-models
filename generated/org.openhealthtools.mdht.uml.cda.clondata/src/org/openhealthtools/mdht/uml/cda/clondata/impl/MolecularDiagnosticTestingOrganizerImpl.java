/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.MolecularDiagnosticTestingOrganizer;
import org.openhealthtools.mdht.uml.cda.clondata.OncotypeDXScore;
import org.openhealthtools.mdht.uml.cda.clondata.operations.MolecularDiagnosticTestingOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.ResultOrganizerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molecular Diagnostic Testing Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MolecularDiagnosticTestingOrganizerImpl extends ResultOrganizerImpl
		implements MolecularDiagnosticTestingOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolecularDiagnosticTestingOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getMolecularDiagnosticTestingOrganizer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMolecularDiagnosticTestingOrganizerCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MolecularDiagnosticTestingOrganizerOperations.validateMolecularDiagnosticTestingOrganizerCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMolecularDiagnosticTestingOrganizerCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MolecularDiagnosticTestingOrganizerOperations.validateMolecularDiagnosticTestingOrganizerCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMolecularDiagnosticTestingOrganizerOncotypeDXScore(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MolecularDiagnosticTestingOrganizerOperations.validateMolecularDiagnosticTestingOrganizerOncotypeDXScore(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OncotypeDXScore> getOncotypeDXScores() {
		return MolecularDiagnosticTestingOrganizerOperations.getOncotypeDXScores(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MolecularDiagnosticTestingOrganizerOperations.validateResultOrganizerTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularDiagnosticTestingOrganizer init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MolecularDiagnosticTestingOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MolecularDiagnosticTestingOrganizerImpl
