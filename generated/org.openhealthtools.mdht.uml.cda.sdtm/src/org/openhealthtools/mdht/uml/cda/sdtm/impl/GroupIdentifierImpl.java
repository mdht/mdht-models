/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.GroupIdentifierOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GroupIdentifierImpl extends org.eclipse.mdht.uml.cda.impl.ActImpl implements GroupIdentifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.GROUP_IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGroupIdentifierTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GroupIdentifierOperations.validateGroupIdentifierTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGroupIdentifierClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GroupIdentifierOperations.validateGroupIdentifierClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGroupIdentifierMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GroupIdentifierOperations.validateGroupIdentifierMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGroupIdentifierId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GroupIdentifierOperations.validateGroupIdentifierId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGroupIdentifierCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GroupIdentifierOperations.validateGroupIdentifierCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGroupIdentifierCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GroupIdentifierOperations.validateGroupIdentifierCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public GroupIdentifier init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //GroupIdentifierImpl
