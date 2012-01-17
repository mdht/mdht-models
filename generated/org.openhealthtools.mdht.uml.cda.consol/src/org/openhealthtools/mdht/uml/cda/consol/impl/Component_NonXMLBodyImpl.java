/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.Component_NonXMLBody;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.Component_NonXMLBodyOperations;
import org.openhealthtools.mdht.uml.cda.impl.NonXMLBodyImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Non XML Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Component_NonXMLBodyImpl extends NonXMLBodyImpl implements Component_NonXMLBody {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Component_NonXMLBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COMPONENT_NON_XML_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonXMLBodyHasReferenceOrRepresentation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return Component_NonXMLBodyOperations.validateNonXMLBodyHasReferenceOrRepresentation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonXMLBodyMediaTypeFileFormats(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Component_NonXMLBodyOperations.validateNonXMLBodyMediaTypeFileFormats(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonXMLBodyText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Component_NonXMLBodyOperations.validateNonXMLBodyText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_NonXMLBody init() {
		CDAUtil.init(this);
		return this;
	}
} // Component_NonXMLBodyImpl
