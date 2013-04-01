/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.operations;

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
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Therapeutic Regimen Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Treatment Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Treatment Not Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#getTreatmentGivenSubstanceAdministrations() <em>Get Treatment Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct#getTreatmentNotGivenSubstanceAdministrations() <em>Get Treatment Not Given Substance Administrations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TherapeuticRegimenActOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TherapeuticRegimenActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActTemplateId(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActTemplateId(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.57')";

	/**
	 * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActTemplateId(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActTemplateId(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.57')
	 * @param therapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTherapeuticRegimenActTemplateId(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.THERAPEUTIC_REGIMEN_ACT);
			try {
				VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(therapeuticRegimenAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID,
						 PhcrPlugin.INSTANCE.getString("TherapeuticRegimenActTemplateId"),
						 new Object [] { therapeuticRegimenAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActClassCode(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActClassCode(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActClassCode(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActClassCode(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param therapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTherapeuticRegimenActClassCode(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.THERAPEUTIC_REGIMEN_ACT);
			try {
				VALIDATE_THERAPEUTIC_REGIMEN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(therapeuticRegimenAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_CLASS_CODE,
						 PhcrPlugin.INSTANCE.getString("TherapeuticRegimenActClassCode"),
						 new Object [] { therapeuticRegimenAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = '133877004' and value.codeSystem = '2.16.840.1.113883.6.96')
	 * @param therapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTherapeuticRegimenActCode(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenActCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(therapeuticRegimenAct)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.THERAPEUTIC_REGIMEN_ACT);
			try {
				VALIDATE_THERAPEUTIC_REGIMEN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(therapeuticRegimenAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_CODE,
						 PhcrPlugin.INSTANCE.getString("TherapeuticRegimenActCode"),
						 new Object [] { therapeuticRegimenAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActMoodCode(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActMoodCode(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActMoodCode(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActMoodCode(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param therapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTherapeuticRegimenActMoodCode(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.THERAPEUTIC_REGIMEN_ACT);
			try {
				VALIDATE_THERAPEUTIC_REGIMEN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(therapeuticRegimenAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_MOOD_CODE,
						 PhcrPlugin.INSTANCE.getString("TherapeuticRegimenActMoodCode"),
						 new Object [] { therapeuticRegimenAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActNegationInd(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActNegationInd(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActNegationInd(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActNegationInd(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.negationInd.oclIsUndefined()
	 * @param therapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTherapeuticRegimenActNegationInd(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.THERAPEUTIC_REGIMEN_ACT);
			try {
				VALIDATE_THERAPEUTIC_REGIMEN_ACT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(therapeuticRegimenAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_NEGATION_IND,
						 PhcrPlugin.INSTANCE.getString("TherapeuticRegimenActNegationInd"),
						 new Object [] { therapeuticRegimenAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActCodeP(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActCodeP(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActCodeP(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActCodeP(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActCode(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActCode(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '133877004' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActCode(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActCode(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param therapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTherapeuticRegimenActCodeP(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.THERAPEUTIC_REGIMEN_ACT);
			try {
				VALIDATE_THERAPEUTIC_REGIMEN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(therapeuticRegimenAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TherapeuticRegimenActCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(therapeuticRegimenAct, context) }),
						 new Object [] { therapeuticRegimenAct }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenActCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenActCodeP", passToken);
				}
				passToken.add(therapeuticRegimenAct);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActStatusCode(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActStatusCode(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActStatusCode(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActStatusCode(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param therapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTherapeuticRegimenActStatusCode(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.THERAPEUTIC_REGIMEN_ACT);
			try {
				VALIDATE_THERAPEUTIC_REGIMEN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(therapeuticRegimenAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_STATUS_CODE,
						 PhcrPlugin.INSTANCE.getString("TherapeuticRegimenActStatusCode"),
						 new Object [] { therapeuticRegimenAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActStatusCodeP(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActStatusCodeP(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActStatusCodeP(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActStatusCodeP(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
	 * @param therapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTherapeuticRegimenActStatusCodeP(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.THERAPEUTIC_REGIMEN_ACT);
			try {
				VALIDATE_THERAPEUTIC_REGIMEN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(therapeuticRegimenAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_STATUS_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TherapeuticRegimenActStatusCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(therapeuticRegimenAct, context) }),
						 new Object [] { therapeuticRegimenAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Treatment Given Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(phcr::TreatmentGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Treatment Given Substance Administration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(phcr::TreatmentGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param therapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.THERAPEUTIC_REGIMEN_ACT);
			try {
				VALIDATE_THERAPEUTIC_REGIMEN_ACT_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(therapeuticRegimenAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION,
						 PhcrPlugin.INSTANCE.getString("TherapeuticRegimenActTreatmentGivenSubstanceAdministration"),
						 new Object [] { therapeuticRegimenAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Treatment Not Given Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_THERAPEUTIC_REGIMEN_ACT_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(phcr::TreatmentNotGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Treatment Not Given Substance Administration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(TherapeuticRegimenAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_THERAPEUTIC_REGIMEN_ACT_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.substanceAdministration.oclIsKindOf(phcr::TreatmentNotGivenSubstanceAdministration) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param therapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(TherapeuticRegimenAct therapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_THERAPEUTIC_REGIMEN_ACT_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.THERAPEUTIC_REGIMEN_ACT);
			try {
				VALIDATE_THERAPEUTIC_REGIMEN_ACT_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THERAPEUTIC_REGIMEN_ACT_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(therapeuticRegimenAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION,
						 PhcrPlugin.INSTANCE.getString("TherapeuticRegimenActTreatmentNotGivenSubstanceAdministration"),
						 new Object [] { therapeuticRegimenAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getTreatmentGivenSubstanceAdministrations(TherapeuticRegimenAct) <em>Get Treatment Given Substance Administrations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentGivenSubstanceAdministrations(TherapeuticRegimenAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(phcr::TreatmentGivenSubstanceAdministration)).oclAsType(phcr::TreatmentGivenSubstanceAdministration)";

	/**
	 * The cached OCL query for the '{@link #getTreatmentGivenSubstanceAdministrations(TherapeuticRegimenAct) <em>Get Treatment Given Substance Administrations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentGivenSubstanceAdministrations(TherapeuticRegimenAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(phcr::TreatmentGivenSubstanceAdministration)).oclAsType(phcr::TreatmentGivenSubstanceAdministration)
	 * @param therapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<TreatmentGivenSubstanceAdministration> getTreatmentGivenSubstanceAdministrations(TherapeuticRegimenAct therapeuticRegimenAct) {
		if (GET_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PhcrPackage.Literals.THERAPEUTIC_REGIMEN_ACT, PhcrPackage.Literals.THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(61));
			try {
				GET_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TreatmentGivenSubstanceAdministration> result = (Collection<TreatmentGivenSubstanceAdministration>) query.evaluate(therapeuticRegimenAct);
		return new BasicEList.UnmodifiableEList<TreatmentGivenSubstanceAdministration>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getTreatmentNotGivenSubstanceAdministrations(TherapeuticRegimenAct) <em>Get Treatment Not Given Substance Administrations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentNotGivenSubstanceAdministrations(TherapeuticRegimenAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(phcr::TreatmentNotGivenSubstanceAdministration)).oclAsType(phcr::TreatmentNotGivenSubstanceAdministration)";

	/**
	 * The cached OCL query for the '{@link #getTreatmentNotGivenSubstanceAdministrations(TherapeuticRegimenAct) <em>Get Treatment Not Given Substance Administrations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentNotGivenSubstanceAdministrations(TherapeuticRegimenAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(phcr::TreatmentNotGivenSubstanceAdministration)).oclAsType(phcr::TreatmentNotGivenSubstanceAdministration)
	 * @param therapeuticRegimenAct The receiving '<em><b>Therapeutic Regimen Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<TreatmentNotGivenSubstanceAdministration> getTreatmentNotGivenSubstanceAdministrations(TherapeuticRegimenAct therapeuticRegimenAct) {
		if (GET_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PhcrPackage.Literals.THERAPEUTIC_REGIMEN_ACT, PhcrPackage.Literals.THERAPEUTIC_REGIMEN_ACT.getEAllOperations().get(62));
			try {
				GET_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY = helper.createQuery(GET_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TreatmentNotGivenSubstanceAdministration> result = (Collection<TreatmentNotGivenSubstanceAdministration>) query.evaluate(therapeuticRegimenAct);
		return new BasicEList.UnmodifiableEList<TreatmentNotGivenSubstanceAdministration>(result.size(), result.toArray());
	}

} // TherapeuticRegimenActOperations