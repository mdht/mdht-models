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

import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EarsNoseMouthThroatSection;

import org.openhealthtools.mdht.uml.cda.consol.operations.EarsNoseMouthThroatSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ears Nose Mouth Throat Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EarsNoseMouthThroatSectionImpl extends SectionImpl implements EarsNoseMouthThroatSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarsNoseMouthThroatSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.EARS_NOSE_MOUTH_THROAT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEarsNoseMouthThroatSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EarsNoseMouthThroatSectionOperations.validateEarsNoseMouthThroatSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEarsNoseMouthThroatSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EarsNoseMouthThroatSectionOperations.validateEarsNoseMouthThroatSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEarsNoseMouthThroatSectionProblemEntry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EarsNoseMouthThroatSectionOperations.validateEarsNoseMouthThroatSectionProblemEntry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservation getProblemEntry() {
		return EarsNoseMouthThroatSectionOperations.getProblemEntry(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarsNoseMouthThroatSection init() {
		CDAUtil.init(this);
		return this;
	}
} // EarsNoseMouthThroatSectionImpl
