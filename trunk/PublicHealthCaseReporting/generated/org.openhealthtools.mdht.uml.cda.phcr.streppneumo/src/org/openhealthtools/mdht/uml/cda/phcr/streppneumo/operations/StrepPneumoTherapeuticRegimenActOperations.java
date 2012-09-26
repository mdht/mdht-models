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

import org.openhealthtools.mdht.uml.cda.phcr.operations.TherapeuticRegimenActOperations;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTreatmentNotGivenSubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.util.StrepPneumoValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Therapeutic Regimen Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTherapeuticRegimenAct#validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Therapeutic Regimen Act Strep Pneumo Treatment Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTherapeuticRegimenAct#validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Therapeutic Regimen Act Strep Pneumo Treatment Not Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTherapeuticRegimenAct#getStrepPneumoTreatmentGivenSubstanceAdministrations() <em>Get Strep Pneumo Treatment Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTherapeuticRegimenAct#getStrepPneumoTreatmentNotGivenSubstanceAdministrations() <em>Get Strep Pneumo Treatment Not Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTherapeuticRegimenAct#validateTherapeuticRegimenActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrepPneumoTherapeuticRegimenActOperations extends TherapeuticRegimenActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrepPneumoTherapeuticRegimenActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministration(StrepPneumoTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Therapeutic Regimen Act Strep Pneumo Treatment Given Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministration(StrepPneumoTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(streppneumo::StrepPneumoTreatmentGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministration(StrepPneumoTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Therapeutic Regimen Act Strep Pneumo Treatment Given Substance Administration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministration(StrepPneumoTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(streppneumo::StrepPneumoTreatmentGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param strepPneumoTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministration(StrepPneumoTherapeuticRegimenAct strepPneumoTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT);
			try {
				VALIDATE_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoTherapeuticRegimenAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION,
						 StrepPneumoPlugin.INSTANCE.getString("StrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministration"),
						 new Object [] { strepPneumoTherapeuticRegimenAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministration(StrepPneumoTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Therapeutic Regimen Act Strep Pneumo Treatment Not Given Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministration(StrepPneumoTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(streppneumo::StrepPneumoTreatmentNotGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministration(StrepPneumoTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Therapeutic Regimen Act Strep Pneumo Treatment Not Given Substance Administration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministration(StrepPneumoTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(streppneumo::StrepPneumoTreatmentNotGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param strepPneumoTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministration(StrepPneumoTherapeuticRegimenAct strepPneumoTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT);
			try {
				VALIDATE_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoTherapeuticRegimenAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION,
						 StrepPneumoPlugin.INSTANCE.getString("StrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministration"),
						 new Object [] { strepPneumoTherapeuticRegimenAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getStrepPneumoTreatmentGivenSubstanceAdministrations(StrepPneumoTherapeuticRegimenAct) <em>Get Strep Pneumo Treatment Given Substance Administrations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoTreatmentGivenSubstanceAdministrations(StrepPneumoTherapeuticRegimenAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(streppneumo::StrepPneumoTreatmentGivenSubstanceAdministration)).oclAsType(streppneumo::StrepPneumoTreatmentGivenSubstanceAdministration)";

	/**
	 * The cached OCL query for the '{@link #getStrepPneumoTreatmentGivenSubstanceAdministrations(StrepPneumoTherapeuticRegimenAct) <em>Get Strep Pneumo Treatment Given Substance Administrations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoTreatmentGivenSubstanceAdministrations(StrepPneumoTherapeuticRegimenAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(streppneumo::StrepPneumoTreatmentGivenSubstanceAdministration)).oclAsType(streppneumo::StrepPneumoTreatmentGivenSubstanceAdministration)
	 * @param strepPneumoTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<StrepPneumoTreatmentGivenSubstanceAdministration> getStrepPneumoTreatmentGivenSubstanceAdministrations(StrepPneumoTherapeuticRegimenAct strepPneumoTherapeuticRegimenAct) {
		if (GET_STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(StrepPneumoPackage.Literals.STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT, StrepPneumoPackage.Literals.STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(63));
			try {
				GET_STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<StrepPneumoTreatmentGivenSubstanceAdministration> result = (Collection<StrepPneumoTreatmentGivenSubstanceAdministration>) query.evaluate(strepPneumoTherapeuticRegimenAct);
		return new BasicEList.UnmodifiableEList<StrepPneumoTreatmentGivenSubstanceAdministration>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getStrepPneumoTreatmentNotGivenSubstanceAdministrations(StrepPneumoTherapeuticRegimenAct) <em>Get Strep Pneumo Treatment Not Given Substance Administrations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoTreatmentNotGivenSubstanceAdministrations(StrepPneumoTherapeuticRegimenAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(streppneumo::StrepPneumoTreatmentNotGivenSubstanceAdministration)).oclAsType(streppneumo::StrepPneumoTreatmentNotGivenSubstanceAdministration)";

	/**
	 * The cached OCL query for the '{@link #getStrepPneumoTreatmentNotGivenSubstanceAdministrations(StrepPneumoTherapeuticRegimenAct) <em>Get Strep Pneumo Treatment Not Given Substance Administrations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoTreatmentNotGivenSubstanceAdministrations(StrepPneumoTherapeuticRegimenAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(streppneumo::StrepPneumoTreatmentNotGivenSubstanceAdministration)).oclAsType(streppneumo::StrepPneumoTreatmentNotGivenSubstanceAdministration)
	 * @param strepPneumoTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<StrepPneumoTreatmentNotGivenSubstanceAdministration> getStrepPneumoTreatmentNotGivenSubstanceAdministrations(StrepPneumoTherapeuticRegimenAct strepPneumoTherapeuticRegimenAct) {
		if (GET_STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(StrepPneumoPackage.Literals.STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT, StrepPneumoPackage.Literals.STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(64));
			try {
				GET_STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<StrepPneumoTreatmentNotGivenSubstanceAdministration> result = (Collection<StrepPneumoTreatmentNotGivenSubstanceAdministration>) query.evaluate(strepPneumoTherapeuticRegimenAct);
		return new BasicEList.UnmodifiableEList<StrepPneumoTreatmentNotGivenSubstanceAdministration>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActTemplateId(StrepPneumoTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActTemplateId(StrepPneumoTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.122')";

	/**
	 * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActTemplateId(StrepPneumoTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActTemplateId(StrepPneumoTherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.122')
	 * @param strepPneumoTherapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTherapeuticRegimenActTemplateId(StrepPneumoTherapeuticRegimenAct strepPneumoTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT);
			try {
				VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoTherapeuticRegimenAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TherapeuticRegimenActTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(strepPneumoTherapeuticRegimenAct, context) }),
						 new Object [] { strepPneumoTherapeuticRegimenAct }));
			}
			 
			return false;
		}
		return true;
	}

} // StrepPneumoTherapeuticRegimenActOperations