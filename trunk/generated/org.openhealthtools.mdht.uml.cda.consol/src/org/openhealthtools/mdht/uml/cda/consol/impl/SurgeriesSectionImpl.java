/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ExternalReference;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.SurgeriesSectionOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surgeries Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SurgeriesSectionImpl extends SurgeriesNarrativeSectionImpl implements SurgeriesSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurgeriesSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SURGERIES_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesSectionExternalReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SurgeriesSectionOperations.validateSurgeriesSectionExternalReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReference getExternalReference() {
		return SurgeriesSectionOperations.getExternalReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureActivityProcedure> getProcedureActivities() {
		return SurgeriesSectionOperations.getProcedureActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSurgeriesNarrativeSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SurgeriesSectionOperations.validateSurgeriesNarrativeSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgeriesSection init() {
    		CDAUtil.init(this);
    		return this;
	}
} //SurgeriesSectionImpl
