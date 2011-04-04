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
import org.openhealthtools.mdht.uml.cda.consol.SurgeriesNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.SurgeriesNarrativeSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surgeries Narrative Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SurgeriesNarrativeSectionImpl extends SectionImpl implements SurgeriesNarrativeSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurgeriesNarrativeSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SURGERIES_NARRATIVE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesNarrativeSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SurgeriesNarrativeSectionOperations.validateSurgeriesNarrativeSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesNarrativeSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SurgeriesNarrativeSectionOperations.validateSurgeriesNarrativeSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesNarrativeSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SurgeriesNarrativeSectionOperations.validateSurgeriesNarrativeSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesNarrativeSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SurgeriesNarrativeSectionOperations.validateSurgeriesNarrativeSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgeriesNarrativeSection init() {
    		CDAUtil.init(this);
    		return this;
	}
} //SurgeriesNarrativeSectionImpl
