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
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPossibleExpossureLocationAndTypeAct;

import org.openhealthtools.mdht.uml.cda.phcr.anthrax.util.AnthraxValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Possible Expossure Location And Type Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPossibleExpossureLocationAndTypeAct#validateAnthraxPossibleExpossureLocationAndTypeActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Possible Expossure Location And Type Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPossibleExpossureLocationAndTypeAct#validateAnthraxPossibleExpossureLocationAndTypeActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Possible Expossure Location And Type Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPossibleExpossureLocationAndTypeAct#validateAnthraxPossibleExpossureLocationAndTypeActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Possible Expossure Location And Type Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPossibleExpossureLocationAndTypeAct#validateAnthraxPossibleExpossureLocationAndTypeActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Possible Expossure Location And Type Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPossibleExpossureLocationAndTypeAct#validateAnthraxPossibleExpossureLocationAndTypeActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Possible Expossure Location And Type Act Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnthraxPossibleExpossureLocationAndTypeActOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnthraxPossibleExpossureLocationAndTypeActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnthraxPossibleExpossureLocationAndTypeActTemplateId(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Possible Expossure Location And Type Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxPossibleExpossureLocationAndTypeActTemplateId(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.41')";

	/**
	 * The cached OCL invariant for the '{@link #validateAnthraxPossibleExpossureLocationAndTypeActTemplateId(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Possible Expossure Location And Type Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxPossibleExpossureLocationAndTypeActTemplateId(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.41')
	 * @param anthraxPossibleExpossureLocationAndTypeAct The receiving '<em><b>Possible Expossure Location And Type Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAnthraxPossibleExpossureLocationAndTypeActTemplateId(AnthraxPossibleExpossureLocationAndTypeAct anthraxPossibleExpossureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(AnthraxPackage.Literals.ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT);
			try {
				VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxPossibleExpossureLocationAndTypeAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 AnthraxValidator.DIAGNOSTIC_SOURCE,
						 AnthraxValidator.ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT__ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID,
						 AnthraxPlugin.INSTANCE.getString("AnthraxPossibleExpossureLocationAndTypeActTemplateId"),
						 new Object [] { anthraxPossibleExpossureLocationAndTypeAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnthraxPossibleExpossureLocationAndTypeActClassCode(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Possible Expossure Location And Type Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxPossibleExpossureLocationAndTypeActClassCode(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateAnthraxPossibleExpossureLocationAndTypeActClassCode(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Possible Expossure Location And Type Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxPossibleExpossureLocationAndTypeActClassCode(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param anthraxPossibleExpossureLocationAndTypeAct The receiving '<em><b>Possible Expossure Location And Type Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAnthraxPossibleExpossureLocationAndTypeActClassCode(AnthraxPossibleExpossureLocationAndTypeAct anthraxPossibleExpossureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(AnthraxPackage.Literals.ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT);
			try {
				VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxPossibleExpossureLocationAndTypeAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 AnthraxValidator.DIAGNOSTIC_SOURCE,
						 AnthraxValidator.ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT__ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE,
						 AnthraxPlugin.INSTANCE.getString("AnthraxPossibleExpossureLocationAndTypeActClassCode"),
						 new Object [] { anthraxPossibleExpossureLocationAndTypeAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnthraxPossibleExpossureLocationAndTypeActMoodCode(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Possible Expossure Location And Type Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxPossibleExpossureLocationAndTypeActMoodCode(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateAnthraxPossibleExpossureLocationAndTypeActMoodCode(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Possible Expossure Location And Type Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxPossibleExpossureLocationAndTypeActMoodCode(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param anthraxPossibleExpossureLocationAndTypeAct The receiving '<em><b>Possible Expossure Location And Type Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAnthraxPossibleExpossureLocationAndTypeActMoodCode(AnthraxPossibleExpossureLocationAndTypeAct anthraxPossibleExpossureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(AnthraxPackage.Literals.ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT);
			try {
				VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxPossibleExpossureLocationAndTypeAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 AnthraxValidator.DIAGNOSTIC_SOURCE,
						 AnthraxValidator.ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT__ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE,
						 AnthraxPlugin.INSTANCE.getString("AnthraxPossibleExpossureLocationAndTypeActMoodCode"),
						 new Object [] { anthraxPossibleExpossureLocationAndTypeAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnthraxPossibleExpossureLocationAndTypeActCode(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Possible Expossure Location And Type Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxPossibleExpossureLocationAndTypeActCode(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = '413350009' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAnthraxPossibleExpossureLocationAndTypeActCode(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Possible Expossure Location And Type Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxPossibleExpossureLocationAndTypeActCode(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = '413350009' and value.codeSystem = '2.16.840.1.113883.6.96'))
	 * @param anthraxPossibleExpossureLocationAndTypeAct The receiving '<em><b>Possible Expossure Location And Type Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAnthraxPossibleExpossureLocationAndTypeActCode(AnthraxPossibleExpossureLocationAndTypeAct anthraxPossibleExpossureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(AnthraxPackage.Literals.ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT);
			try {
				VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxPossibleExpossureLocationAndTypeAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 AnthraxValidator.DIAGNOSTIC_SOURCE,
						 AnthraxValidator.ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT__ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_CODE,
						 AnthraxPlugin.INSTANCE.getString("AnthraxPossibleExpossureLocationAndTypeActCode"),
						 new Object [] { anthraxPossibleExpossureLocationAndTypeAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAnthraxPossibleExpossureLocationAndTypeActStatusCode(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Possible Expossure Location And Type Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxPossibleExpossureLocationAndTypeActStatusCode(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAnthraxPossibleExpossureLocationAndTypeActStatusCode(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Possible Expossure Location And Type Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAnthraxPossibleExpossureLocationAndTypeActStatusCode(AnthraxPossibleExpossureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param anthraxPossibleExpossureLocationAndTypeAct The receiving '<em><b>Possible Expossure Location And Type Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAnthraxPossibleExpossureLocationAndTypeActStatusCode(AnthraxPossibleExpossureLocationAndTypeAct anthraxPossibleExpossureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(AnthraxPackage.Literals.ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT);
			try {
				VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxPossibleExpossureLocationAndTypeAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 AnthraxValidator.DIAGNOSTIC_SOURCE,
						 AnthraxValidator.ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT__ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE,
						 AnthraxPlugin.INSTANCE.getString("AnthraxPossibleExpossureLocationAndTypeActStatusCode"),
						 new Object [] { anthraxPossibleExpossureLocationAndTypeAct }));
			}
			return false;
		}
		return true;
	}

} // AnthraxPossibleExpossureLocationAndTypeActOperations