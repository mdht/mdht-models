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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Informant_RelatedEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.Informant_RelatedEntityOperations;

import org.openhealthtools.mdht.uml.cda.impl.RelatedEntityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Informant Related Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Informant_RelatedEntityImpl extends RelatedEntityImpl implements Informant_RelatedEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Informant_RelatedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.INFORMANT_RELATED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Informant_RelatedEntityOperations.validateRelatedEntityAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedEntityPerson(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Informant_RelatedEntityOperations.validateRelatedEntityPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Informant_RelatedEntity init() {
		CDAUtil.init(this);
		return this;
	}
} // Informant_RelatedEntityImpl
