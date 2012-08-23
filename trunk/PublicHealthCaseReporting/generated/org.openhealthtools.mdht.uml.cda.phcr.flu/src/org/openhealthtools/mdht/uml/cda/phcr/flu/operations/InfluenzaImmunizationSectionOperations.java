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
package org.openhealthtools.mdht.uml.cda.phcr.flu.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.flu.FluPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;

import org.openhealthtools.mdht.uml.cda.phcr.flu.util.fluValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Influenza Immunization Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationSection#validateInfluenzaImmunizationSectionInfluenzaImmunizationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Immunization Section Influenza Immunization Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationSection#getInfluenzaImmunizationActivities() <em>Get Influenza Immunization Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaImmunizationSection#validateImmunizationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfluenzaImmunizationSectionOperations extends ImmunizationsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenzaImmunizationSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaImmunizationSectionInfluenzaImmunizationActivity(InfluenzaImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Immunization Section Influenza Immunization Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaImmunizationSectionInfluenzaImmunizationActivity(InfluenzaImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_IMMUNIZATION_SECTION_INFLUENZA_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(flu::InfluenzaImmunizationActivity) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaImmunizationSectionInfluenzaImmunizationActivity(InfluenzaImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Immunization Section Influenza Immunization Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaImmunizationSectionInfluenzaImmunizationActivity(InfluenzaImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_IMMUNIZATION_SECTION_INFLUENZA_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(flu::InfluenzaImmunizationActivity) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param influenzaImmunizationSection The receiving '<em><b>Influenza Immunization Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaImmunizationSectionInfluenzaImmunizationActivity(InfluenzaImmunizationSection influenzaImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_IMMUNIZATION_SECTION_INFLUENZA_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_IMMUNIZATION_SECTION);
			try {
				VALIDATE_INFLUENZA_IMMUNIZATION_SECTION_INFLUENZA_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_IMMUNIZATION_SECTION_INFLUENZA_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_IMMUNIZATION_SECTION_INFLUENZA_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaImmunizationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_IMMUNIZATION_SECTION__INFLUENZA_IMMUNIZATION_SECTION_INFLUENZA_IMMUNIZATION_ACTIVITY,
						 FluPlugin.INSTANCE.getString("InfluenzaImmunizationSectionInfluenzaImmunizationActivity"),
						 new Object [] { influenzaImmunizationSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfluenzaImmunizationActivities(InfluenzaImmunizationSection) <em>Get Influenza Immunization Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaImmunizationActivities(InfluenzaImmunizationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFLUENZA_IMMUNIZATION_ACTIVITIES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(flu::InfluenzaImmunizationActivity)).oclAsType(flu::InfluenzaImmunizationActivity)";

	/**
	 * The cached OCL query for the '{@link #getInfluenzaImmunizationActivities(InfluenzaImmunizationSection) <em>Get Influenza Immunization Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaImmunizationActivities(InfluenzaImmunizationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFLUENZA_IMMUNIZATION_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(flu::InfluenzaImmunizationActivity)).oclAsType(flu::InfluenzaImmunizationActivity)
	 * @param influenzaImmunizationSection The receiving '<em><b>Influenza Immunization Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<InfluenzaImmunizationActivity> getInfluenzaImmunizationActivities(InfluenzaImmunizationSection influenzaImmunizationSection) {
		if (GET_INFLUENZA_IMMUNIZATION_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(fluPackage.Literals.INFLUENZA_IMMUNIZATION_SECTION, fluPackage.Literals.INFLUENZA_IMMUNIZATION_SECTION.getEAllOperations().get(65));
			try {
				GET_INFLUENZA_IMMUNIZATION_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_INFLUENZA_IMMUNIZATION_ACTIVITIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFLUENZA_IMMUNIZATION_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InfluenzaImmunizationActivity> result = (Collection<InfluenzaImmunizationActivity>) query.evaluate(influenzaImmunizationSection);
		return new BasicEList.UnmodifiableEList<InfluenzaImmunizationActivity>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationsSectionTemplateId(InfluenzaImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionTemplateId(InfluenzaImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.47')";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationsSectionTemplateId(InfluenzaImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionTemplateId(InfluenzaImmunizationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.47')
	 * @param influenzaImmunizationSection The receiving '<em><b>Influenza Immunization Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateImmunizationsSectionTemplateId(InfluenzaImmunizationSection influenzaImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_IMMUNIZATION_SECTION);
			try {
				VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaImmunizationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_IMMUNIZATION_SECTION__IMMUNIZATIONS_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ImmunizationsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(influenzaImmunizationSection, context) }),
						 new Object [] { influenzaImmunizationSection }));
			}
			 
			return false;
		}
		return true;
	}

} // InfluenzaImmunizationSectionOperations