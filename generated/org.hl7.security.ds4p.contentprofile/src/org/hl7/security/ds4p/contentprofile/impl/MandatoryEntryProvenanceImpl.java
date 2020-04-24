/**
 */
package org.hl7.security.ds4p.contentprofile.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.AuthorImpl;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.MandatoryEntryProvenance;
import org.hl7.security.ds4p.contentprofile.operations.MandatoryEntryProvenanceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mandatory Entry Provenance</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MandatoryEntryProvenanceImpl extends AuthorImpl implements MandatoryEntryProvenance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MandatoryEntryProvenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONTENTPROFILEPackage.Literals.MANDATORY_ENTRY_PROVENANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMandatoryEntryProvenanceTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MandatoryEntryProvenanceOperations.validateMandatoryEntryProvenanceTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMandatoryEntryProvenanceTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MandatoryEntryProvenanceOperations.validateMandatoryEntryProvenanceTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMandatoryEntryProvenanceAssignedAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MandatoryEntryProvenanceOperations.validateMandatoryEntryProvenanceAssignedAuthor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryEntryProvenance init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryEntryProvenance init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MandatoryEntryProvenanceImpl
