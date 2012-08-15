/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.ccd.operations.ImmunizationsSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPlugin;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.util.StrepPneumoValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoImmunizationSection#validateStrepPneumoImmunizationSectionStrepPneumoImmunizationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Immunization Section Strep Pneumo Immunization Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoImmunizationSection#getStrepPneumoImmunizationActivities() <em>Get Strep Pneumo Immunization Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoImmunizationSection#validateImmunizationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrepPneumoImmunizationSectionOperations extends ImmunizationsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrepPneumoImmunizationSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStrepPneumoImmunizationSectionStrepPneumoImmunizationActivity(StrepPneumoImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Immunization Section Strep Pneumo Immunization Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoImmunizationSectionStrepPneumoImmunizationActivity(StrepPneumoImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STREP_PNEUMO_IMMUNIZATION_SECTION_STREP_PNEUMO_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(streppneumo::StrepPneumoImmunizationActivity) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateStrepPneumoImmunizationSectionStrepPneumoImmunizationActivity(StrepPneumoImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Immunization Section Strep Pneumo Immunization Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoImmunizationSectionStrepPneumoImmunizationActivity(StrepPneumoImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_IMMUNIZATION_SECTION_STREP_PNEUMO_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(streppneumo::StrepPneumoImmunizationActivity) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param strepPneumoImmunizationSection The receiving '<em><b>Immunization Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStrepPneumoImmunizationSectionStrepPneumoImmunizationActivity(StrepPneumoImmunizationSection strepPneumoImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STREP_PNEUMO_IMMUNIZATION_SECTION_STREP_PNEUMO_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_IMMUNIZATION_SECTION);
			try {
				VALIDATE_STREP_PNEUMO_IMMUNIZATION_SECTION_STREP_PNEUMO_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_IMMUNIZATION_SECTION_STREP_PNEUMO_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_IMMUNIZATION_SECTION_STREP_PNEUMO_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoImmunizationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_IMMUNIZATION_SECTION__STREP_PNEUMO_IMMUNIZATION_SECTION_STREP_PNEUMO_IMMUNIZATION_ACTIVITY,
						 StrepPneumoPlugin.INSTANCE.getString("StrepPneumoImmunizationSectionStrepPneumoImmunizationActivity"),
						 new Object [] { strepPneumoImmunizationSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getStrepPneumoImmunizationActivities(StrepPneumoImmunizationSection) <em>Get Strep Pneumo Immunization Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoImmunizationActivities(StrepPneumoImmunizationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STREP_PNEUMO_IMMUNIZATION_ACTIVITIES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(streppneumo::StrepPneumoImmunizationActivity)).oclAsType(streppneumo::StrepPneumoImmunizationActivity)";

	/**
	 * The cached OCL query for the '{@link #getStrepPneumoImmunizationActivities(StrepPneumoImmunizationSection) <em>Get Strep Pneumo Immunization Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoImmunizationActivities(StrepPneumoImmunizationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STREP_PNEUMO_IMMUNIZATION_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(streppneumo::StrepPneumoImmunizationActivity)).oclAsType(streppneumo::StrepPneumoImmunizationActivity)
	 * @param strepPneumoImmunizationSection The receiving '<em><b>Immunization Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<StrepPneumoImmunizationActivity> getStrepPneumoImmunizationActivities(StrepPneumoImmunizationSection strepPneumoImmunizationSection) {
		if (GET_STREP_PNEUMO_IMMUNIZATION_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(StrepPneumoPackage.Literals.STREP_PNEUMO_IMMUNIZATION_SECTION, StrepPneumoPackage.Literals.STREP_PNEUMO_IMMUNIZATION_SECTION.getEAllOperations().get(65));
			try {
				GET_STREP_PNEUMO_IMMUNIZATION_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_STREP_PNEUMO_IMMUNIZATION_ACTIVITIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STREP_PNEUMO_IMMUNIZATION_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<StrepPneumoImmunizationActivity> result = (Collection<StrepPneumoImmunizationActivity>) query.evaluate(strepPneumoImmunizationSection);
		return new BasicEList.UnmodifiableEList<StrepPneumoImmunizationActivity>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationsSectionTemplateId(StrepPneumoImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionTemplateId(StrepPneumoImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.52')";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationsSectionTemplateId(StrepPneumoImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionTemplateId(StrepPneumoImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.52')
	 * @param strepPneumoImmunizationSection The receiving '<em><b>Immunization Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateImmunizationsSectionTemplateId(StrepPneumoImmunizationSection strepPneumoImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_IMMUNIZATION_SECTION);
			try {
				VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoImmunizationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_IMMUNIZATION_SECTION__IMMUNIZATIONS_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ImmunizationsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(strepPneumoImmunizationSection, context) }),
						 new Object [] { strepPneumoImmunizationSection }));
			}
			 
			return false;
		}
		return true;
	}

} // StrepPneumoImmunizationSectionOperations