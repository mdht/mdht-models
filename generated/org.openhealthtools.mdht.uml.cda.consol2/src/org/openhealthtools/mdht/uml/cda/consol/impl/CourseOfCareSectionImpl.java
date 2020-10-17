/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.CourseOfCareSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Of Care Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CourseOfCareSectionImpl extends SectionImpl implements CourseOfCareSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseOfCareSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COURSE_OF_CARE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseOfCareSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CourseOfCareSectionOperations.validateCourseOfCareSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseOfCareSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CourseOfCareSectionOperations.validateCourseOfCareSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseOfCareSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CourseOfCareSectionOperations.validateCourseOfCareSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseOfCareSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CourseOfCareSectionOperations.validateCourseOfCareSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseOfCareSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CourseOfCareSectionOperations.validateCourseOfCareSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseOfCareSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseOfCareSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CourseOfCareSectionImpl
