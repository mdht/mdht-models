/**
 */
package org.hl7.security.ds4p.contentprofile.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.AssignedAuthorImpl;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.MandatoryEntryAssignedAuthor;
import org.hl7.security.ds4p.contentprofile.operations.MandatoryEntryAssignedAuthorOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mandatory Entry Assigned Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MandatoryEntryAssignedAuthorImpl extends AssignedAuthorImpl implements MandatoryEntryAssignedAuthor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MandatoryEntryAssignedAuthorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONTENTPROFILEPackage.Literals.MANDATORY_ENTRY_ASSIGNED_AUTHOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMandatoryEntryAssignedAuthorTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MandatoryEntryAssignedAuthorOperations.validateMandatoryEntryAssignedAuthorTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMandatoryEntryAssignedAuthorAssignedAuthoringDevice(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MandatoryEntryAssignedAuthorOperations.validateMandatoryEntryAssignedAuthorAssignedAuthoringDevice(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMandatoryEntryAssignedAuthorAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MandatoryEntryAssignedAuthorOperations.validateMandatoryEntryAssignedAuthorAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMandatoryEntryAssignedAuthorRepresentedOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MandatoryEntryAssignedAuthorOperations.validateMandatoryEntryAssignedAuthorRepresentedOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryEntryAssignedAuthor init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryEntryAssignedAuthor init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MandatoryEntryAssignedAuthorImpl
