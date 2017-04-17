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
import org.openhealthtools.mdht.uml.cda.clondata.EstrogenReceptorStatus;
import org.openhealthtools.mdht.uml.cda.clondata.HER2ReceptorStatus;
import org.openhealthtools.mdht.uml.cda.clondata.ProgesteroneReceptorStatus;
import org.openhealthtools.mdht.uml.cda.clondata.ReceptorStatusOrganizer;
import org.openhealthtools.mdht.uml.cda.clondata.operations.ReceptorStatusOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.ResultOrganizerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receptor Status Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ReceptorStatusOrganizerImpl extends ResultOrganizerImpl implements ReceptorStatusOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceptorStatusOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getReceptorStatusOrganizer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceptorStatusOrganizerCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReceptorStatusOrganizerOperations.validateReceptorStatusOrganizerCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceptorStatusOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReceptorStatusOrganizerOperations.validateReceptorStatusOrganizerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceptorStatusOrganizerEstrogenReceptorStatus(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReceptorStatusOrganizerOperations.validateReceptorStatusOrganizerEstrogenReceptorStatus(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceptorStatusOrganizerProgesteroneReceptorStatus(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReceptorStatusOrganizerOperations.validateReceptorStatusOrganizerProgesteroneReceptorStatus(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceptorStatusOrganizerHER2ReceptorStatus(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReceptorStatusOrganizerOperations.validateReceptorStatusOrganizerHER2ReceptorStatus(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstrogenReceptorStatus getEstrogenReceptorStatus() {
		return ReceptorStatusOrganizerOperations.getEstrogenReceptorStatus(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgesteroneReceptorStatus getProgesteroneReceptorStatus() {
		return ReceptorStatusOrganizerOperations.getProgesteroneReceptorStatus(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HER2ReceptorStatus getHER2ReceptorStatus() {
		return ReceptorStatusOrganizerOperations.getHER2ReceptorStatus(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReceptorStatusOrganizerOperations.validateResultOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReceptorStatusOrganizer init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReceptorStatusOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ReceptorStatusOrganizerImpl
