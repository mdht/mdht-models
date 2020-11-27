/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NoteActivity;
import org.openhealthtools.mdht.uml.cda.consol.operations.NoteActivityOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NoteActivityImpl extends ActImpl implements NoteActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.NOTE_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NoteActivityOperations.validateNoteActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteActivityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NoteActivityOperations.validateNoteActivityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NoteActivityOperations.validateNoteActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteActivityText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NoteActivityOperations.validateNoteActivityText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NoteActivityOperations.validateNoteActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteActivityEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NoteActivityOperations.validateNoteActivityEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NoteActivityOperations.validateNoteActivityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NoteActivityOperations.validateNoteActivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteActivityAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NoteActivityOperations.validateNoteActivityAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteActivityParticipant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NoteActivityOperations.validateNoteActivityParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteActivityReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NoteActivityOperations.validateNoteActivityReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteActivityCDTranslation1P(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NoteActivityOperations.validateNoteActivityCDTranslation1P(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteActivityCDTranslation1(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NoteActivityOperations.validateNoteActivityCDTranslation1(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteActivityIVLTSValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NoteActivityOperations.validateNoteActivityIVLTSValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteActivity init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteActivity init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // NoteActivityImpl
